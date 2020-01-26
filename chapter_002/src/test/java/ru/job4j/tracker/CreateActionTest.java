package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CreateActionTest {
    @Test
    public void whenAddItem() {
        Input input = new StubInput(new String[] {"Fix PC"});
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}
