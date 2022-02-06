package com.metadevs.PaladinsTasks.PaladinsTasksLesson4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        printEvenNumbersInRange(a, b);
    }

    static void printEvenNumbersInRange(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
