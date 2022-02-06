package com.metadevs.PaladinsTasks.PaladinsTasksLesson3;

public class Task3_1 {
    public static void main(String[] args) {

        int intMonth;
        intMonth = (int) (1 + Math.random() * 12);

        if (intMonth == 1 || intMonth == 2 || intMonth == 12) {
            System.out.println("Зима");
        }

        if (intMonth == 3 || intMonth == 4 || intMonth == 5) {
            System.out.println("Весна");
        }

        if (intMonth == 6 || intMonth == 7 || intMonth == 8) {
            System.out.println("Лето");
        }

        if (intMonth == 9 || intMonth == 10 || intMonth == 11) {
            System.out.println("Осень");
        }

        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int randomMonth = (int) (Math.random() * months.length);
        String stringMonth = months[randomMonth];

        switch (stringMonth) {
            case "Январь":
                System.out.println("Зима");
                break;
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
                System.out.println("Весна");
                break;
            case "Апрель":
                System.out.println("Весна");
                break;
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
                System.out.println("Лето");
                break;
            case "Июль":
                System.out.println("Лето");
                break;
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
                System.out.println("Осень");
                break;
            case "Октябрь":
                System.out.println("Осень");
                break;
            case "Ноябрь":
                System.out.println("Осень");
                break;
            case "Декабрь":
                System.out.println("Зима");
                break;
            default:
                break;
        }
    }
}
