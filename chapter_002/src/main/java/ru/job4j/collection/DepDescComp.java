package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] arResultO1 = o1.split("/");
        String[] arResultO2 = o2.split("/");

        int rst = arResultO2[0].compareTo(arResultO1[0]);
        return rst == 0 ? o1.compareTo(o2) : rst;
    }
}