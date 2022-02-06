package com.metadevs.PaladinsTasks.PaladinsTasksLesson4;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printArrayElementsInReverseOrder(scan.nextInt());
    }

    static void printArrayElementsInReverseOrder(int x) {
        String[] strArray = new String[x];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < (strArray.length); i++) {
            strArray[i] = scan.nextLine();
        }

        for (int i = (strArray.length - 1); i >= 0; i--) {
            System.out.print(strArray[i] + " ");
        }
    }
}
