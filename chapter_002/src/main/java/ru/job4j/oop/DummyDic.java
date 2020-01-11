package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }
    public static void main(String[] args) {
        DummyDic john = new DummyDic();
        String frasies = john.engToRus("By");
        System.out.println(frasies);
    }
}
