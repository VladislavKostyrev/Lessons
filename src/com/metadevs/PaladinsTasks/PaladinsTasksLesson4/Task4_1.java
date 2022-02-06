package com.metadevs.PaladinsTasks.PaladinsTasksLesson4;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printFactorialThisNumber(n);
    }

    static void printFactorialThisNumber(int x) {
        int f = 1;
        for (int i = 0; i < x; i++) {
            f = f + f * i;
        }
        System.out.println(f);
    }
}