package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class DeleteActionTest {
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        ArrayList<String> answers = new ArrayList<>();
        answers.add(item.getId());
        new DeleteAction().execute(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is(nullValue()));
    }
}
