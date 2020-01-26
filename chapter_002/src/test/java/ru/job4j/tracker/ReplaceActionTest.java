package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ReplaceActionTest {
    @Test
    public void whenReplaceItem() {
        Item item = new Item("new item");
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {item.getId(), "replaced item"};
        new ReplaceAction().execute(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }
}