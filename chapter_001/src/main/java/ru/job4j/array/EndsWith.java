package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word.length >= post.length) {
            for (int i = 0; i < post.length; i++) {
                result = (word[word.length - 1 - i] == post[post.length - 1 - i]);
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
