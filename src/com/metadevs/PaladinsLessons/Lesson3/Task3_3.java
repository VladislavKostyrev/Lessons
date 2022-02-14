package com.metadevs.PaladinsLessons.Lesson3;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int[] numbers = {5, 0, -3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            a = ((a == 2 || a == 0) ? a + 7 : a / 10);
            System.out.println(a);
        }

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            System.out.println((0 < a && a < 5) ? "Верно" : "Неверно");
        }
    }
}