package com.metadevs.Lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        int year = 1980;
        for (int j = 0; j < 6; j++) {
            System.out.println("Год " + year++);
        }

        int[] araiV1 = new int[]{1, 2, 3, 4, 42};
        System.out.println(araiV1[4]);
        araiV1[3] = 67;
        for (int j = 0; j < araiV1.length; j++) {
            System.out.println(araiV1[j]);
        }

        for (int item : araiV1) {
            System.out.println(item);
        }

        int[][] array = new int[8][8];
        array[0][0] = 5;
        array[0][1] = 55;
        System.out.println(array[0][1] + array[0][0]);
        System.out.println(array[1][0] + array[0][0]);
    }
}