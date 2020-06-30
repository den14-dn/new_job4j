package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] arResultO1 = o1.split("/");
        String[] arResultO2 = o2.split("/");

        int size = Math.min(arResultO1.length, arResultO2.length);
        int rst = arResultO1.length - arResultO2.length;

        if (size > 0) {
            int rstFirst = arResultO2[0].compareTo(arResultO1[0]);
            if (rstFirst == 0) {
                if (rst != 0) {
                    return rst;
                }
                for (int index = 1; index < size; index++) {
                    rst = arResultO1[index].compareTo(arResultO2[index]);
                    if (rst != 0) {
                        return rst;
                    }
                }
            } else {
                return rstFirst;
            }
        }

        return rst;
    }
}