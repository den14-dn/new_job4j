package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rst = Integer.compare(left.length(), right.length());

        int size = Math.min(left.length(), right.length());
        for (int index = 0; index < size; index++) {
            char charLeft = left.charAt(index);
            char charRight = right.charAt(index);
            int rstChar = Character.compare(charLeft, charRight);
            if (rstChar != 0) {
                rst = rstChar;
                break;
            }
        }

        return rst;
    }
}
