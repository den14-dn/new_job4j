package ru.job4j.school;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0.0);
    }
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(pupil -> {
            double average = pupil.getSubjects().stream().mapToInt(Subject::getScore).average().orElse(0.0);
            Tuple tuple = new Tuple(pupil.getName(), average);
            return tuple;
        }).collect(Collectors.toList());
    }
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(entry -> {
                    return new Tuple(entry.getKey(), entry.getValue());
                }).collect(Collectors.toList());
    }
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(pupil -> {
            double sum = pupil.getSubjects().stream().mapToInt(Subject::getScore).sum();
            Tuple tuple = new Tuple(pupil.getName(), sum);
            return tuple;
        }).max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingInt(Subject::getScore)))
                .entrySet().stream()
                .map(entry ->
                        new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }
}
