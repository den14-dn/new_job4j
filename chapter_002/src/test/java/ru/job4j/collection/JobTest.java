package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import java.util.Comparator;

public class JobTest {
    @Test
    public void whenAscByName() {
        int rsl = new JobAscByName().compare(
                    new Job("Bug", 1),
                    new Job("Task", 2)
                );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenDescByName() {
        int rsl = new JobDescByName().compare(
                new Job("Task", 1),
                new Job("Bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenAscByPriority() {
        int rsl = new JobAscByPriority().compare(
                new Job("Task", 1),
                new Job("Bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenDescByPriority() {
        int rsl = new JobDescByPriority().compare(
                new Job("Task", 3),
                new Job("Bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameDescAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAscAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAscAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameDescAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByPriorityDescAndNameDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByPriorityAscAndNameAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 2)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByPriorityAscAndNameDesc() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 4)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByPriorityDescAndNameAsc() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobAscByName());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}
