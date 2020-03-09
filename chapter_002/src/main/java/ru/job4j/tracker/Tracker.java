package ru.job4j.tracker;

import java.util.Random;
import java.util.ArrayList;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     * @return irem
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод заменяет заявку найденную по индексу на новую заявку.
     * @param id старой заявки.
     * @param item новая заявка.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index >= 0) {
            item.setId(id);
            items.set(index, item);
            result = true;
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index >= 0) {
            this.items.remove(index);
            result = true;
        }
        return result;
    }

    /**
     * Метод возвращает index по переданному id элемента.
     * @param id элемента из массива.
     * @return index.
     */
    private int indexOf(String id) {
        int result = -1;
        int index = 0;
        for (Item el : this.items) {
            if (el.getId().equals(id)) {
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    /**
     * Метод возвращает из хранилища все созданные заявки
     * @return массив item'ов
     */
    public ArrayList<Item> findAll() {
        return this.items;
    }

    /**
     * Метод для поиска всех заявок по наименованию
     * @param key для поиска по наименованию
     * @return массив item'ов
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> itemsWithoutNull = new ArrayList<>();
        for (Item el : this.items) {
            if (el.getName().equals(key)) {
                itemsWithoutNull.add(el);
            }
        }
        return itemsWithoutNull;
    }

    /**
     * Метод поиска заявки по id.
     * @param id
     * @return item
     */
    public Item findById(String id) {
        Item result = null;
        int index = indexOf(id);
        if (index >= 0) {
            return items.get(index);
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}