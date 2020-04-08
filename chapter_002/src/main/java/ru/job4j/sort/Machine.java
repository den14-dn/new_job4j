package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int balance = money - price;
        int[] rsl = new int[100];
        int size = 0;
        for (int coin : COINS) {
            while (balance >= coin) {
                balance -= coin;
                rsl[size++] = coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
