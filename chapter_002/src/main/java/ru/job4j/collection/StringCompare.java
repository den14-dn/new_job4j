package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = 0;

        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            char charLeft = left.charAt(index);
            char charRight = right.charAt(index);
            rst = Character.compare(charLeft, charRight);
            if (rst != 0) {
                break;
            }
        }

        if (rst == 0 && left.length() < right.length()) {
            rst = -1;
        }

        return rst;
    }
}
