package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start + ((start.length() == 0) ? "" : "/") + el;
                tmp.add(start);
            }
        }
        List<String> rst = new ArrayList<>(tmp);
        Collections.sort(rst);
        return rst;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
