package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenp6k2s2() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }
    @Test
    public void whenp4k1s1() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }
}
