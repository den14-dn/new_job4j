package ru.job4j.tracker;

public class Animal {
    private String name;
    public Animal() {
        super();
        System.out.println("load Animal");
    }
    public Animal(String nick) {
        this.name = nick;
    }
}
