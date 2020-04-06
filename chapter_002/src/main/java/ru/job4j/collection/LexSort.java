package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int intLeft = toNumber(left);
        int intRight = toNumber(right);
        return Integer.compare(intLeft, intRight);
    }

    private int toNumber(String value) {
        int rst = -1;

        String[] words = value.split(".");
        if (words.length > 0) {
            rst = Integer.valueOf(words[0]);
        }

        return rst;
    }
}
