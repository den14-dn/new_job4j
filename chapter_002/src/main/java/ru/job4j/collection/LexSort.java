package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int intLeft = toNumber(left);
        int intRight = toNumber(right);
        return Integer.compare(intLeft, intRight);
    }

    private int toNumber(String value) {
        int rst = -1;

        String numeral = "0123456789";
        String number = "";

        for (int index = 0; index < value.length(); index++) {
            char symbol = value.charAt(index);
            if (numeral.indexOf(symbol) < 0) {
                break;
            }
            number = number.concat(String.valueOf(symbol));
        }

        if (number != "") {
            rst = Integer.valueOf(number);
        }

        return rst;
    }
}
