package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     * @return irem
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод заменяет заявку найденную по индексу на новую заявку.
     * @param id старой заявки.
     * @param item новая заявка.
     */
    public void replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
    }

    public void delete(String id) {
        int index = indexOf(id);
        int size = items.length - index - 1;
        System.arraycopy(items, index + 1, items, index, size);
        items[items.length - 1] = null;
    }

    /**
     * Метод возвращает index по переданному id элемента.
     * @param id элемента из массива.
     * @return index.
     */
    private int indexOf(String id) {
        int result = -1;

        for (int index = 0; index != this.position; index++) {
            Item el = this.items[index];
            if (el != null && el.getId().equals(id)) {
                 result = index;
                 break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает из хранилища все созданные заявки
     * @return массив item'ов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Метод для поиска всех заявок по наименованию
     * @param key для поиска по наименованию
     * @return массив item'ов
     */
    public Item[] findByName(String key) {
        Item[] itemsWithoutNull = new Item[this.items.length];
        int size = 0;
        for (Item el : this.items) {
            if (el != null && el.getName().equals(key)) {
                itemsWithoutNull[size++] = el;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
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
            return items[index];
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
