package com.metadevs.PaladinsTasks.lesson1;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();

        int sum = value1 + value2;
        int difference = value1 - value2;
        int product = value1 * value2;
        double quotient = (double) value1 / value2;

        System.out.print(sum + "\n" + difference + "\n" + product + "\n" + quotient);
    }
}