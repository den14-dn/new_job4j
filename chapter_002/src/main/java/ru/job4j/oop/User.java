package ru.job4j.oop;

public class User {
    /**
     * @name это поле объекта
     * @age это поле объекта
     */
    private String name;
    private int age;

    public boolean canDrive() {
        boolean can = false; // это локальная переменная
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
