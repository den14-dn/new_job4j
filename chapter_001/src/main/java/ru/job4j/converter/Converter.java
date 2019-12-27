package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollars = rubleToDollar(240);
        System.out.println("250 rubles are " + dollars + " dollars.");
        int ruble = euroToRuble(4);
        System.out.println("2 euro are " + ruble + " rubles.");
        ruble = euroToRuble(6);
        System.out.println("6 dollars are " + ruble + " rubles.");
    }
}
