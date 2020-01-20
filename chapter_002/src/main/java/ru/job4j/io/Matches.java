package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countMatches = 11;
        int gamer = 1;

        while (countMatches > 0) {
            System.out.println(gamer + " игрок вводит число от 1 до 3: ");
            int count = Integer.valueOf(input.nextLine());

            if (count >= 1 && count <= 3) {
                countMatches -= count;
                if (countMatches > 0) {
                    gamer = (gamer == 1) ? 2 : 1;
                } else {
                    countMatches = 0;
                    System.out.println("Победил игрок : " + gamer);
                }
                System.out.println("На столе спичек : " + countMatches);
            }
        }

        System.out.println("Игра завершена.");
    }
}
