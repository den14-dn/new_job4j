package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rst = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        //for (int index = 0; index < rst.length; index++) {
        int index = 0;
        while (i < left.length || j < right.length) {
            index = i + j;
            if (i == left.length) {
                rst[index] = right[j];
                j++;
            } else if (j == right.length) {
                rst[index] = left[i];
                i++;
            } else if (left[i] <= right[j]) {
                rst[index] = left[i];
                i++;
            } else if (right[j] < left[i]) {
                rst[index] = right[j];
                j++;
            }
        }
        return rst;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rst = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rst));
    }
}
