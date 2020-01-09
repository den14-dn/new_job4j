package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    @Test
    public void when5() {
        assertThat(PrimeNumber.calc(5), is(3));
    }
    @Test
    public void when11() {
        assertThat(PrimeNumber.calc(11), is(5));
    }
    @Test
    public void when2() {
        assertThat(PrimeNumber.calc(2), is(1));
    }
}
