package ru.job4j.stream;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixTest {
    @Test
    public void whenFormatMatrix() {
        List<List<Integer>> matrix = Stream.of(
                List.of(1, 4),
                List.of(2, 3),
                List.of(0, 1, 2)
        ).collect(Collectors.toList());

        Matrix mtx = new Matrix();
        List<Integer> rst = mtx.format(matrix);

        List<Integer> exp = List.of(1, 4, 2, 3, 0, 1, 2);

        assertThat(rst, is(exp));
    }
}