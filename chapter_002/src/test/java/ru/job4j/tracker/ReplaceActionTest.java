package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReplaceActionTest {
    @Test
    public void whenReplaceItem() {
        Item item = new Item("new item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        ArrayList<String> answers = new ArrayList<>();
        answers.add(item.getId());
        answers.add("replaced item");
        new ReplaceAction().execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
}