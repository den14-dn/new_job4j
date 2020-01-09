package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        int first = 6;
        int second = 2;
        int third = 3;
        int forth = 5;
        int out = SqMax.max(first, second, third, forth);
        assertThat(out, is(6));
    }
    @Test
    public void whenSecondMax() {
        int first = 6;
        int second = 7;
        int third = 3;
        int forth = 5;
        int out = SqMax.max(first, second, third, forth);
        assertThat(out, is(7));
    }
    @Test
    public void whenThirdMax() {
        int first = 6;
        int second = 2;
        int third = 8;
        int forth = 5;
        int out = SqMax.max(first, second, third, forth);
        assertThat(out, is(8));
    }
    @Test
    public void whenForthMax() {
        int first = 6;
        int second = 2;
        int third = 3;
        int forth = 9;
        int out = SqMax.max(first, second, third, forth);
        assertThat(out, is(9));
    }
}
