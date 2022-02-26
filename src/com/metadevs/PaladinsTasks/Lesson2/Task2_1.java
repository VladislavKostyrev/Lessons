package com.metadevs.PaladinsTasks.Lesson2;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        if (value > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
    }
}