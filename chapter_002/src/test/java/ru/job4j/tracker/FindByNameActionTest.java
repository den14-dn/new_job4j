package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringJoiner;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindByNameActionTest {
    @Test
    public void whenFindByName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        Item item = new Item("fix bug");
        Tracker tracker = new Tracker();
        tracker.add(item);
        ArrayList<String> list = new ArrayList<>();
        list.add("fix bug");
        StubInput input = new StubInput(list);
        new FindByNameAction().execute(input, tracker);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Item: " + item.getName() + ", id: " + item.getId())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

        System.setOut(def);
    }
}
