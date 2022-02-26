package com.metadevs.PaladinsTasks.Lesson2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        task2_2a();
        task2_2b();
        task2_2c();
        task2_2d();
        task2_2e();
        task2_2f();
        task2_2g();
        task2_2h();
    }

    static void task2_2a() {
        int a = 10;
        int b = 5;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    static void task2_2b() {
        int a = 50;
        int b = 25;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    static void task2_2c() {
        int a = 67;
        int b = 23;
        boolean statement = (a < b);
        System.out.println(statement);
    }

    static void task2_2d() {
        int a = 90;
        int b = 80;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    static void task2_2e() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 5;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    static void task2_2f() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int a = 100;
            System.out.println("Введите целое число больше ста.");
            int b = scan.nextInt();

            if (!(b > 100 && b == (int) b)) {
                System.out.println("Ошибка. Введите целое число больше ста.");
            } else {
                boolean statement = (a < b);
                System.out.println(statement);
                break;
            }
        }
    }

    static void task2_2g() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int b = 60;
            System.out.println("Введите 30.");
            int a = scan.nextInt() + b / 2;

            if (!(a != 30 && a == (int) b)) {
                System.out.println("Ошибка. Введите 30.");
            } else {
                boolean statement = (a == b);
                System.out.println(statement);
                break;
            }
        }
    }

    static void task2_2h() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите 73.");
            int a = scan.nextInt(), b = 146 / 2;
            a = a + b;

            if (!(a != 73 && a == (int) b)) {
                System.out.println("Ошибка. Введите 73.");
            } else {
                boolean statement = (a == b);
                System.out.println(statement);
                break;
            }
        }
    }
}