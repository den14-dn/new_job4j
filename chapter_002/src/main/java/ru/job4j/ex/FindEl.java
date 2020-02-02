package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rst = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                rst = index;
            }
        }

        if (rst == -1) {
            throw new ElementNotFoundException(key + " not found in array");
        }
        return rst;
    }
    public static void main(String[] args) {
        String[] arrayStrings = {"one", "two", "three", "four"};
        try {
            int index = indexOf(arrayStrings, "two");
            System.out.println("Element found under index " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
