package ru.job4j.lambda;

import ru.job4j.pojo.Student;
import ru.job4j.pojo.Mark;

import java.io.ByteArrayInputStream;
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
//        Comparator<Attachment> comparator = (o1, o2) -> o1.getSize() - o2.getSize();
        Arrays.sort(atts, comparator);

        raw(Arrays.asList(atts), new Function<Attachment, InputStream>() {
            @Override
            public InputStream apply(Attachment att) {
                return new ByteArrayInputStream(att.toString().getBytes());
            }
        });
        raw(Arrays.asList(atts), att -> {
            return new ByteArrayInputStream(att.toString().getBytes());
        });

        Comparator<Student> compStudent = new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getFio().compareTo(st2.getFio());
            }
        };
        Comparator<Student> compStLambda = (st1, st2) -> st1.getFio().compareTo(st2.getFio());

        Student student = new Mark();
        test(student, new Function<Student, Mark>() {
            @Override
            public Mark apply(Student student) {
                return (Mark) student;
            }
        });
        test(student, st -> (Mark) st);
    }

    public static void raw(List<Attachment> list, Function<Attachment, InputStream> func) {
        for (Attachment att : list) {
            func.apply(att);
        }
    }

    public static void test(Student student, Function<Student, Mark> func) {
        Mark mark = func.apply(student);
    }
}