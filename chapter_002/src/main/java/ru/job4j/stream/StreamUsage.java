package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    public static void main(String[] args) {
        // 1
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );
        List<Task> bugs = tasks.stream().filter(element -> element.name.contains("Bug")).collect(Collectors.toList());
        bugs.forEach(System.out::println);

        // 2
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(-3);
        arrayList.add(6);
        arrayList.add(9);
        List<Integer> list = arrayList.stream().filter(el -> el >= 0).collect(Collectors.toList());
        System.out.println(list);
    }
}
