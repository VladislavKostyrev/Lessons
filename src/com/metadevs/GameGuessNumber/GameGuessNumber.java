package com.metadevs.GameGuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100) + 1;
        int generalCountOfTries = 10;
        int countOfUsedTries = 0;

        System.out.println("Угадайте загаданое число в диапазоне 1 - 100.");
        while (countOfUsedTries < generalCountOfTries) {
            System.out.println("Введите число: ");
            if (!scan.hasNextInt()) {
                System.out.println("Пожалуйста, введите ЧИСЛО!");
                scan.nextLine();
                continue;
            }

            int userNumber = scan.nextInt();
            countOfUsedTries++;

            if (userNumber == randomNumber) {
                System.out.println("Ура, вы угадали. Число совершенных попыток: " + countOfUsedTries + ".");
                break;
            }

            System.out.print("Вы не угадали. Загаданое число " + (randomNumber < userNumber ? "меньше." : "больше."));
            System.out.println("Число оставшихся попыток: " + (generalCountOfTries - countOfUsedTries) + ".");
        }
        System.out.println("Загаданое число было " + randomNumber + ".");
    }
}