package com.metadevs.OOP.OOP1;

public class Person {
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

    Person(int age, String name, String lastName) {
        setAge(age);
        setName(name);
        setLastName(lastName);
    }

    public void setAge(int age) {
        ageValidate(age);
        this.age = age;
    }

    public void ageValidate(int age) throws AgeIsLessThen18Exception {
        if (age < 18) {
            throw new AgeIsLessThen18Exception("Возраст сотрудника меньше 18-ти лет!");
        }
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
        salaryValidate();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isSalaryNotLessThenAge() {
        return salary >= age;
    }

    public void salaryValidate() {
        if (!(isSalaryNotLessThenAge())) {
            throw new SalaryLessOrEqualThenAgeException("ВНИМАНИЕ! Зарплата сотрудника(цы) меньше или ровна его(её) возрасту! СРОЧНО ПОВЫСЬТЕ ЗАРПЛАТУ!!!");
        }
        System.out.println("Порядок. Зарплата сотрудника(цы) не меньше его(её) возраста.");
    }

    public static void renameCompany(String newCompanyName) {
        companyName = newCompanyName;
    }

    public static void main(String[] args) {
        Person bob = new Person(28, "Bob", "Dylan");
        Person alex = new Person(18, "Alex", "Navalny");

        bob.companyName = "Boston Dynamics";
        alex.companyName = "DNS";
        System.out.println(bob.companyName + "\n" + alex.companyName);
    }
}