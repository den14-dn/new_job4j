package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Shubko Denis Nikolaevich");
        student.setGroup("PO21");
        student.setReceiptDate(new Date());

        System.out.println("Student " + student.getFio() + " entered the group " + student.getGroup() + " - " + student.getReceiptDate());
    }
}
