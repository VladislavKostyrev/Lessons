package com.metadevs.PaladinsTasks.PaladinsTasksLesson4;

public class Task4_4 {
    public static void main(String[] args) {
        int[][] twoDimArr = {{1, 2}, {4, 8}, {16, 32}, {64, 128}};
        int[][] twoDimArrCopy = new int[4][2];

        for (int row = 0; row < twoDimArr.length; row++) {
            for (int col = 0; col < twoDimArr[row].length; col++) {
                int rowReverse = (twoDimArr.length - 1) - row;
                int colReverse = (twoDimArr[row].length - 1) - col;

                twoDimArrCopy[row][col] = twoDimArr[twoDimArr.length - 1 - row][twoDimArr[row].length - 1 - col];
                String a = String.format("%3d", twoDimArrCopy[row][col]);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}