package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println(new Fact().calc(1));
    }

    public int calc(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Argument 'n' must be greater 0");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl += index;
        }
        return rsl;
    }
}