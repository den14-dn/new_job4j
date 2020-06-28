package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rst = o1.length() - o2.length();
        int size = Math.min(o1.length(), o2.length());
        for (int i = 0; i < size; i++) {
            if (o1.charAt(i) < o2.charAt(i)) {
                rst = -1;
            } else if (o1.charAt(i) > o2.charAt(i)) {
                rst = 1;
            }
        }
        return rst;
    }
}