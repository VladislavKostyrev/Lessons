package com.metadevs.PussyFeeder;

import java.util.Scanner;

public class PussyFeeder {
    static int[] quantityPortionsAtCats = new int[5];

    public static void main(String[] args) {
        boolean endProgramme = false;
        System.out.println("Вы можете добавлять или убирать порции в кошачьих мисках.");

        while (!endProgramme) {
            showInputMenu();
            int userSelection = inputAndCheckOfNum();
            if (userSelection == 666) {
                endProgramme = true;
                System.out.println("Завершаю программу.");
                continue;
            }

            makeSelectionFromActionsMenu(quantityPortionsAtCats, userSelection);
            checkQuantityPortionsInDishes(quantityPortionsAtCats);
            printQuantityPortionsInDishes(quantityPortionsAtCats);
        }
    }

    static void printQuantityPortionsInDishes(int[] quantityPortionsAtCats) {
        System.out.println();
        for (int i = 0; i < quantityPortionsAtCats.length; i++) {
            System.out.println("Миска киски под номером " + i + " содержит порций: " + quantityPortionsAtCats[i] + ".");
        }
    }

    static void checkQuantityPortionsInDishes(int[] quantityPortionsAtCats) {
        System.out.println();
        for (int i = 0; i < quantityPortionsAtCats.length; i++) {
            if (quantityPortionsAtCats[i] > 7) {
                quantityPortionsAtCats[i] = 7;
                System.out.println("Упс. Кажется миска под номером " + i + " переполнена. Лишнее придётся отдать бездомным котам.");
            } else if (quantityPortionsAtCats[i] < 0) {
                quantityPortionsAtCats[i] = 0;
                System.out.println("Ой. в миске под номером " + i + " ничего не осталось. Вы опустощили её до конца.");
            }
        }
    }

    static void addPortionsToAllDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите добавить в каждую миску? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();

        for (int i = 0; i < quantityPortionsAtCats.length; i++) {
            quantityPortionsAtCats[i] += quantityAddedPortions;
        }
    }

    static void subtractPortionsToAllDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите убрать из каждой миски? \nВаш ввод: ");
        int quantitySubtractedPortions = inputAndCheckOfNum();

        for (int i = 0; i < quantityPortionsAtCats.length; i++) {
            quantityPortionsAtCats[i] -= quantitySubtractedPortions;
        }
    }

    static void addPortionsToOneSelectedDish(int[] quantityPortionsAtCats) {
        System.out.print("\nКакой киске вы хотите добавить порцию? Напишите её номер (индекс массива, номера кошек начинаются с 0).\nВаш ввод: ");
        int numberCat = inputAndCheckOfNum();
        numberCat = checkInputArrayElem(numberCat, quantityPortionsAtCats);
        System.out.print("Сколько порций вы хотите добавить в миску? \nВаш ввод: ");
        int quantitySubtractedPortions = inputAndCheckOfNum();
        quantityPortionsAtCats[numberCat] += quantitySubtractedPortions;
    }

    static void subtractPortionsToOneSelectedDish(int[] quantityPortionsAtCats) {
        System.out.print("\nУ какой киски вы хотите убрать порцию? Напишите её номер (индекс массива, номера кошек начинаются с 0).\nВаш ввод: ");
        int numberCat = inputAndCheckOfNum();
        numberCat = checkInputArrayElem(numberCat, quantityPortionsAtCats);
        System.out.print("Сколько порций вы хотите убрать из миски? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();
        quantityPortionsAtCats[numberCat] -= quantityAddedPortions;
    }

    static void addPortionsToEvenDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите добавить в каждую миску всем четным кискам? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();

        for (int i = 0; i < quantityPortionsAtCats.length; i += 2) {
            quantityPortionsAtCats[i] += quantityAddedPortions;
        }
    }

    static void subtractPortionsToEvenDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите убрать из каждой миски у всех четных кисок? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();

        for (int i = 0; i < quantityPortionsAtCats.length; i += 2) {
            quantityPortionsAtCats[i] -= quantityAddedPortions;
        }
    }

    static void addPortionsToNotEvenDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите добавить в каждую миску всем нечетным кискам? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();

        for (int i = 1; i < quantityPortionsAtCats.length; i += 2) {
            quantityPortionsAtCats[i] += quantityAddedPortions;
        }
    }

    static void subtractPortionsToNotEvenDishes(int[] quantityPortionsAtCats) {
        System.out.print("\nСколько порций вы хотите убрать из каждой миски у всех нечетных кисок? \nВаш ввод: ");
        int quantityAddedPortions = inputAndCheckOfNum();

        for (int i = 1; i < quantityPortionsAtCats.length; i += 2) {
            quantityPortionsAtCats[i] -= quantityAddedPortions;
        }
    }

    static int checkInputArrayElem(int numberCat, int[] quantityPortionsAtCats) {
        while (numberCat < 0 || numberCat >= quantityPortionsAtCats.length) {
            System.out.print("Киски под таким номером нет. Пожалуйста повторите ввод. \nВаш ввод: ");
            numberCat = inputAndCheckOfNum();
        }
        return numberCat;
    }

    static void makeSelectionFromActionsMenu(int[] quantityPortionsAtCats, int userSelection) {
        while (userSelection > 8 || userSelection < 1) {
            System.out.println("\nПожалуйста, введите корректный номер действия!");
            showInputMenu();
            userSelection = inputAndCheckOfNum();
        }

        if (userSelection == 1)
            addPortionsToAllDishes(quantityPortionsAtCats);
        else if (userSelection == 2)
            addPortionsToOneSelectedDish(quantityPortionsAtCats);
        else if (userSelection == 3)
            addPortionsToNotEvenDishes(quantityPortionsAtCats);
        else if (userSelection == 4)
            addPortionsToEvenDishes(quantityPortionsAtCats);
        else if (userSelection == 5)
            subtractPortionsToAllDishes(quantityPortionsAtCats);
        else if (userSelection == 6)
            subtractPortionsToOneSelectedDish(quantityPortionsAtCats);
        else if (userSelection == 7)
            subtractPortionsToNotEvenDishes(quantityPortionsAtCats);
        else
            subtractPortionsToEvenDishes(quantityPortionsAtCats);
    }

    static int inputAndCheckOfNum() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.print("Введите число: ");
            scan.next();
        }
        return scan.nextInt();
    }

    static void showInputMenu() {
        System.out.println("\nПоложить заданное колличество порций во все миски - введите 1.");
        System.out.println("Пположить заданное колличество порций в миску конкретной киски - введите 2.");
        System.out.println("Положить заданное колличество порций в миски всем нечетным кискам - введите 3.");
        System.out.println("Пположить заданное колличество порций в миски всем четным кискам - введите 4.");
        System.out.println("Убрать заданное колличество порций из всех мисок - введите 5.");
        System.out.println("Убрать заданное колличество порций из миски конкретной киски - введите 6.");
        System.out.println("Убрать заданное колличество порций из всех мисок нечетных кисок - введите 7.");
        System.out.println("Убрать заданное колличество порций из всех мисок четных кисок - введите 8.");
        System.out.println("Для выхода из программы введите специальный код апокалипсиса.");
        System.out.print("Ваш ввод: ");
    }
}