package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalc {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rst = new ArrayList<>();
        for (int i = start; i < end; i++) {
            rst.add(func.apply((double) i));
        }
        return rst;
    }
}