package ru.job4j.lambda;

import java.util.Comparator;

public class Lesson421 {
    Comparator<String> cmpText = (left, right) -> left.compareTo(right);
    Comparator<String> cmpDescSize = (left, right) -> right.length() - left.length();
}
