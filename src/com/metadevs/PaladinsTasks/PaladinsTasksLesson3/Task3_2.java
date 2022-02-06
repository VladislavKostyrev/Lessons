package com.metadevs.PaladinsTasks.PaladinsTasksLesson3;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int i = scan.nextInt();

        if (number < i) {
            while (number < i) {
                System.out.println("Любая фраза");
                number++;
            }
        } else {
            System.out.println("Заданное число больше или равно i");
        }
    }
}



