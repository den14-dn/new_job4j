package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length >= pref.length) {
            for (int i = 0; i < pref.length; i++) {
                result = (word[i] == pref[i]);
                if (!result) {
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
