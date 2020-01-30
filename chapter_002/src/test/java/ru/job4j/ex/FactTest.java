package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest {
    @Test (expected = IllegalArgumentException.class)
    public void whenArgument0ThenException() {
        Fact fact = new Fact();
        fact.calc(0);
    }
    @Test
    public void whenArgument3Then() {
        Fact fact = new Fact();
        int rst = fact.calc(3);
        int expect = 4;
        assertThat(rst, is(expect));
    }
}
