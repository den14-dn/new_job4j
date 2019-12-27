package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / 2 / k;
        double L = h * k;
        return L * h;
    }
    public static void main(String[] args) {
        double result = square(6, 2);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
    }
}
