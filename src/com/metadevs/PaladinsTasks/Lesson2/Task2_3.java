package com.metadevs.PaladinsTasks.Lesson2;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Что говорит кошка?");
        String answer = scan.nextLine();
        answer = answer.toLowerCase();

        if (answer.equals("мяу")) {
            System.out.println("Да, верно!");
        } else {
            System.out.println("Это говорит какое-то другое животное...");
        }
    }
}