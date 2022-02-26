package com.metadevs.PaladinsTasks.lesson1;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String secondName = scan.nextLine();
        int age = scan.nextInt();

        System.out.println("Фамилия: " + secondName + "\n" + "Имя: " + name + "\n" + "Возвраст: " + age);
    }
}
