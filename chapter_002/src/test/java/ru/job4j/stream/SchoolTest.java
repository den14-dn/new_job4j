package ru.job4j.stream;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.List;
import java.util.Map;

public class SchoolTest {
    @Test
    public void whenStudentsFor10V() {
        Student st1 = new Student(29, "Сударев");
        Student st2 = new Student(50, "Толстой");
        Student st3 = new Student(72, "Беспалов");

        List<Student> students = List.of(st1, st2, st3);

        School school = new School();
        Map<String, Student> rst = school.collect(students, el -> el.getScore() > 0 && el.getScore() < 50);

        Map<String, Student> exp = Map.of(st1.getSurname(), st1);
        assertThat(rst, is(exp));
    }
    @Test
    public void whenStudentsFor10B() {
        Student st1 = new Student(29, "Сударев");
        Student st2 = new Student(50, "Толстой");
        Student st3 = new Student(72, "Беспалов");

        List<Student> students = List.of(st1, st2, st3);

        School school = new School();
        Map<String, Student> rst = school.collect(students, el -> el.getScore() >= 50 && el.getScore() < 70);

        Map<String, Student> exp = Map.of(st2.getSurname(), st2);
        assertThat(rst, is(exp));
    }
    @Test
    public void whenStudentsFor10A() {
        Student st1 = new Student(29, "Сударев");
        Student st2 = new Student(50, "Толстой");
        Student st3 = new Student(72, "Беспалов");
        Student st4 = new Student(72, "Беспалов");

        List<Student> students = List.of(st1, st2, st3, st4);

        School school = new School();
        Map<String, Student> rst = school.collect(students, el -> el.getScore() >= 70 && el.getScore() <= 100);

        Map<String, Student> exp = Map.of(st3.getSurname(), st3);
        assertThat(rst, is(exp));
    }
}
