package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException{
        int rst = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index] == key) {
                rst = index;
            }
        }

        if (rst == -1) {
            throw new UserInputException(key + " not found in array");
        }
        return rst;
    }
    public static void main(String[] args) {
        String[] arrayStrings = {"one", "two", "three", "four"};
        try {
            int index = indexOf(arrayStrings, "twoo");
            System.out.println("Element found under index " + index);
        } catch (UserInputException e) {
            e.printStackTrace();
        }

    }
}
