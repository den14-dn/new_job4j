package ru.job4j.stragery;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder picture = new StringBuilder();
        for (int i = 0; i <= 4; i++) {
            picture.append("+ + + + +");
            if (i < 4) {
                picture.append(System.lineSeparator());
            }
        }
        return picture.toString();
    }
}
