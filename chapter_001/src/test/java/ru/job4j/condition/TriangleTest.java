package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2, 2, 2);
        assertThat(result, is(true));
    }
    @Test
    public void whenNotExist() {
        boolean result = Triangle.exist(2, 2, 4);
        assertThat(result, is(false));
    }
    @Test
    public void whenAreaTestTriangle() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 2);
        Point thirdPoint = new Point(2, 0);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);
        double result = triangle.area();
        assertThat(result, is(1.9999999999999991));
    }
}
