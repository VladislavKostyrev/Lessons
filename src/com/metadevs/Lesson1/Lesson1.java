package com.metadevs.Lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("All right");

        int value1 = 3;
        int value2 = 7;

        int sum = value1 + value2;
        System.out.println("Сумма " + sum);

        int multiply = value1 * value2;
        System.out.println("Произведение " + multiply);

        int difference = value1 - value2;
        System.out.println("Разность " + difference);

        Scanner scanner = new Scanner(System.in);
        //String userInput = Scanner.next()
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}
