package com.metadevs.PaladinsTasks.PaladinsTasksLesson3;

public class Task3_3 {
    public static void main(String[] args) {
        int[] numbers = {5, 0, -3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            a = (a == 0 || a == 2) ? (a = a + 7) : (a = a / 10);
            System.out.println(a);
        }

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            String ss = (0 < a && a < 5) ? (ss = "Верно") : (ss = "Не верно");
            System.out.println(ss);
        }
    }
}