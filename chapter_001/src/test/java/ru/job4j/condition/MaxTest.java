package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when1Max2Then1() {
        int result = Max.max(4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void when2Max1Then2() {
        int result = Max.max(3, 5);
        assertThat(result, is(5));
    }
    @Test
    public void when1Equal2Then2() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }
}
