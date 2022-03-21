package com.metadevs.OOP.OOP1;

import java.util.Scanner;

public class Person {
    static Scanner scanner = new Scanner(System.in);
    static private String companyName;
    private int age;
    private String name;
    private String lastName;
    private double salary;

    static {
        companyName = "Unnamed company";
    }

    {
        name = "Absent name";
        lastName = "Absent last name";
        salary = 0;
    }

    Person() {
    }

    Person(int age, String name, String lastName, double salary) {
        setAge(age);
        setName(name);
        setLastName(lastName);
        setSalary(salary);
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new AgeIsLessThen18Exception("Возвраст сотрудника меньше 18-ти лет!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new SalaryIsLessThen0Exception("Зарплата сотрудника(цы) меньше нуля!");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void renameCompany() {
        companyName = scanner.nextLine();
    }

    public boolean isSalaryNotLessThenAge() {
        return salary >= age;
    }

    public static void salaryValidate(Person person) {
        if (!(person.isSalaryNotLessThenAge())) {
            throw new SalaryLessOrEqualThenAgeException("ВНИМАНИЕ! Зарплата сотрудника(цы) меньше или ровна его(её) возврасту! СРОЧНО ПОВЫСЬТЕ ЗАРПЛАТУ!!!");
        }
        System.out.println("Порядок. Зарплата сотрудника(цы) не меньше его(её) возвраста.");
    }

    public static void main(String[] args) {
        Person bob = new Person(28, "Bob", "Dylan", 300000);
        Person alex = new Person(18, "Alex", "Navalny", 100);

        bob.companyName = "Boston Dynamics";
        alex.companyName = "DNS";
        System.out.println(bob.companyName + "\n" + alex.companyName);
        salaryValidate(alex);

        Company Metadevs = new Company("Metadevs");
        Metadevs.hirePerson(alex);
        Metadevs.hirePerson(bob);
        Metadevs.printAllPerson();
    }
}