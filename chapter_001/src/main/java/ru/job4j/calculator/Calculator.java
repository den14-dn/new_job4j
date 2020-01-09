package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Denis Shubko (den14-dn@yandex.ru)
 */
public class Calculator {
    /**
     * Add.
     * @param first - первое слагаемое
     * @param second - второе слагаемое
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    /**
     * Div.
     * @param first - делимое
     * @param second - делитель
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Multiply.
     * @param first - первый множитель
     * @param second - второй множитель
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Subtract.
     * @param first - вычитаемое
     * @param second - вычитатель
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     * @param args - вводимые параметры из консоли
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
