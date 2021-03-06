package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenFiveThenOneHundredTwenty() {
        assertThat(Factorial.calc(5), is(120));
    }
    @Test
    public void whenZeroThenOne() {
        assertThat(Factorial.calc(0), is(1));
    }
    @Test
    public void whenOneThenOne() {
        assertThat(Factorial.calc(1), is(1));
    }
}
