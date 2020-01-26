package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ShowAllActionTest {
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        Tracker tracker = new Tracker();
        Item item = new Item("fix bug");
        tracker.add(item);
        ShowAllAction act = new ShowAllAction();
        act.execute(new StubInput(new String[] {}), tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Item: " + item.getName() + ", id: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

        System.setOut(def);
    }
}
