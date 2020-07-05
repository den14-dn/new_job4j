package ru.job4j.lambda;

import ru.job4j.oop.Student;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 130),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o1.getSize() - o2.getSize();
            }
        };
        Arrays.sort(atts, comparator);

        List<Attachment> list = Arrays.asList(atts);
        raw(list, new Function<Attachment, InputStream>() {
                @Override
                public InputStream apply(Attachment attachment) {
                    return null;
                }
            });
    }

    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
    }
}
