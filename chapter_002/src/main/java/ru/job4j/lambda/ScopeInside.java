package ru.job4j.lambda;

import java.util.function.BiFunction;

public class ScopeInside {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int total = 0;
        for (int i = 0; i < number.length; i++) {
            int num = i;
            total = add(total, num, (s1, s2) -> s1 + s2);
        }
        System.out.println(total);
    }
    private static Integer add(Integer s1, Integer s2, BiFunction<Integer, Integer, Integer> func) {
        return func.apply(s1, s2);
    }
}
