package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when1Max2Then1() {
        Max max = new Max();
        int result = max.max(4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void when2Max1Then2() {
        Max max = new Max();
        int result = max.max(3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void when1Equal2Then2() {
        Max max = new Max();
        int result = max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void when123Then3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when1234Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}
