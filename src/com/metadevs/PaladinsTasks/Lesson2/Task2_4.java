package com.metadevs.PaladinsTasks.Lesson2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value2 = scan.nextInt();
        int value1 = scan.nextInt();
        boolean statement1 = (value1 > value2);
        boolean statement2 = (value1 < value2);

        if (statement1) {
            System.out.println("Первое введённое число меньше второго");
        } else if (statement2) {
            System.out.println("Первое введённое число больше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}