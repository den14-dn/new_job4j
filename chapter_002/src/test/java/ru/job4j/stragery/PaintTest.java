package ru.job4j.stragery;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenSquare() {
        Square square = new Square();

        StringBuilder sb = new StringBuilder();
        sb.append("+ + + + +");
        sb.append(System.lineSeparator());
        sb.append("+ + + + +");
        sb.append(System.lineSeparator());
        sb.append("+ + + + +");
        sb.append(System.lineSeparator());
        sb.append("+ + + + +");
        sb.append(System.lineSeparator());
        sb.append("+ + + + +");

        assertThat(square.draw(), is(sb.toString()));
    }

    @Test
    public void whenTriangle() {
        Triangle triangle = new Triangle();

        StringBuilder trg = new StringBuilder();
        trg.append("    +    ");
        trg.append(System.lineSeparator());
        trg.append("   +++   ");
        trg.append(System.lineSeparator());
        trg.append("  +++++  ");
        trg.append(System.lineSeparator());
        trg.append(" +++++++ ");
        trg.append(System.lineSeparator());
        trg.append("+++++++++");

        assertThat(triangle.draw(), is(trg.toString()));
    }

    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        new Paint().draw(new Square());
        assertThat(new String(out.toByteArray()),
                is(new StringBuilder().append("+ + + + +")
                    .append(System.lineSeparator())
                    .append("+ + + + +")
                    .append(System.lineSeparator())
                    .append("+ + + + +")
                    .append(System.lineSeparator())
                    .append("+ + + + +")
                    .append(System.lineSeparator())
                    .append("+ + + + +")
                    .append(System.lineSeparator()).toString()
                )
        );
        System.setOut(stdout);
    }
}
