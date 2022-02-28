package com.metadevs.LiveCoding.LiveCoding1;

import java.util.Scanner;

public class LiveCoding1 {
    public static void main(String[] args) {
        int value1;
        int value2;
        int numberOfExpression;
        int expressionResult;
        double quotient;

        System.out.println("Введите первое число: " + (value1 = inputAndCheckOfNum()));
        System.out.println("Введите второе число: " + (value2 = inputAndCheckOfNum()));
        System.out.println("Введите номер операции: ");
        System.out.println("1.Сложение" + "\n" + "2.Вычитание" + "\n" + "3.Умножение" + "\n" + "4. Деление");
        numberOfExpression = inputAndCheckOfNumExpression();
        expressionResult = calculate(value1, value2, numberOfExpression);
        quotient = calculateQuotient(value1, value2);
        printResultOfExpression(value1, value2, numberOfExpression, expressionResult, quotient);
    }

    static void printResultOfExpression(int value1, int value2, int numberOfExpression, int expressionResult, double quotient) {
        if (numberOfExpression != 4)
            System.out.println("Результат: " + expressionResult);
        else if (value2 != 0 && value1 % value2 != 0)
            System.out.println("Результат: " + quotient);
        else if (value2 != 0)
            System.out.println("Результат: " + expressionResult);
    }

    static double calculateQuotient(int value1, int value2) {
        return (double) value1 / value2;
    }

    static int calculate(int value1, int value2, int numberOfExpression) {
        int expressionResult = 0;
        switch (numberOfExpression) {
            case 1:
                expressionResult = value1 + value2;
                break;
            case 2:
                expressionResult = value1 - value2;
                break;
            case 3:
                expressionResult = value1 * value2;
                break;
            case 4:
                if (value2 == 0) {
                    System.out.println("Деление на ноль невозможно.");
                    break;
                }
                expressionResult = value1 / value2;
        }
        return expressionResult;
    }

    static int inputAndCheckOfNumExpression() {
        Scanner scan = new Scanner(System.in);
        int numberOfExpression;
        numberOfExpression = inputAndCheckOfNum();
        while (numberOfExpression < 1 || numberOfExpression > 4) {
            System.out.println("Пожалуйста, введите корректный номер операции.");
            System.out.println("1.Сложение" + "\n" + "2.Вычитание" + "\n" + "3.Умножение" + "\n" + "4. Деление");
            numberOfExpression = inputAndCheckOfNum();
        }
        return numberOfExpression;
    }

    static int inputAndCheckOfNum() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Введите число!");
            scan.next();
        }
        return scan.nextInt();
    }
}