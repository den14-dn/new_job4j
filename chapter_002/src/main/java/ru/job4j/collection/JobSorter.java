package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 1),
                new Job("Fix bugs", 4),
                new Job("Fix bugs", 2),
                new Job("Impl task", 3),
                new Job("Reboot server", 0)
        );
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
    }
}
