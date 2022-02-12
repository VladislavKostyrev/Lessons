package com.metadevs.PaladinsTasks.PaladinsTasksLesson3;

public class Task3_3 {
    public static void main(String[] args) {
        int [] numbers = {5, 0, -3, 2};

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            if (a == 0 || a == 2) {
                a = a + 7;
            } else {
                a = a / 10;
            }
            System.out.println(a);
        }

        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            if (0 < a && a < 5) {
                System.out.println("Верно");
            } else {
                System.out.println("Неверно");
            }
        }
    }
}
