package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] values, String key) throws ElementNotFoundException {
        int rst = -1;
        for (int index = 0; index < values.length; index++) {
            if (values[index].equals(key)) {
                rst = index;
                break;
            }
        }

        if (rst == -1) {
            throw new ElementNotFoundException(key + " not found in array");
        }
        return rst;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String el : abuses) {
            if (el.equals(value)) {
                throw new ElementAbuseException(value + " is in the list abuses");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
//        } catch (ElementAbuseException ea) {
//            ea.printStackTrace();
//        } catch (ElementNotFoundException en) {
//            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
//        } catch (Throwable th) {
//            th.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] arrayStrings = {"one", "two", "three", "four"};
        String key = "two";
        String[] abuses = {"one", "five", "seven"};

        process(arrayStrings, key, abuses);
    }
}
