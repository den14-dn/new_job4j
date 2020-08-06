package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
    public List<Integer> format(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(el -> el.stream()).collect(Collectors.toList());
    }
}
