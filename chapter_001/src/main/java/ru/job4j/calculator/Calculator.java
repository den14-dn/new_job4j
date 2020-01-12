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
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        double tmp = add(second, third);
        return add(first, tmp);
    }

    /**
     * Div.
     * @param first - делимое
     * @param second - делитель
     */
    public void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /**
     * Multiply.
     * @param first - первый множитель
     * @param second - второй множитель
     */
    public void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Subtract.
     * @param first - вычитаемое
     * @param second - вычитатель
     */
    public void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main.
     * @param args - вводимые параметры из консоли
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("1 + 1 = " + calculator.add(1, 1));
        calculator.div(4, 2);
        calculator.multiply(2, 1);
        calculator.subtract(10, 5);
    }
}
