package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = new ArrayList<>() {
            @Override
            public boolean add(Attachment o) {
                System.out.println("Add a new element to list: " + o);
                return super.add(o);
            }
        };
        attachments.add(new Attachment("image 1", 100));
        attachments.add(new Attachment("image 3", 13));
        attachments.add(new Attachment("image 2", 34));

        Comparator comparatorOnSize = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };
        attachments.sort(comparatorOnSize);
        System.out.println(attachments);

        Comparator<Attachment> comparatorOnName = new Comparator<>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                String left = o1.getName();
                String right = o2.getName();

                int result = 0;
                if (left.length() < right.length()) {
                    result = -1;
                } else if (left.length() > right.length()) {
                    result = 1;
                }

                int lengthName = Math.min(left.length(), right.length());

                for (int i = 0; i < lengthName; i++) {
                    int rst = left.charAt(i) - right.charAt(i);
                    if (rst != 0) {
                        result = rst;
                        break;
                    }
                }
                return result;
            }
        };
        attachments.sort(comparatorOnName);
        System.out.println(attachments);
    }
}
