package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = true;
        for (int i = 1; i <= num; i++) {
            if ((num % i) == 0 && num != i && i != 1) {
                prime = false;
            }
        }
        return prime;
    }
}
