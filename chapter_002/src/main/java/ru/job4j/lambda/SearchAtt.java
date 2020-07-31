package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rst = filter(list, el -> el.getSize() > 100);
        return rst;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rst = filter(list, el -> el.getName().contains("bug"));
        return rst;
    }

    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rst = new ArrayList<>();
        for (Attachment el : list) {
            if (predicate.test(el)) {
                rst.add(el);
            }
        }
        return rst;
    }
}