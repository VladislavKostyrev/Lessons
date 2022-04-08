package com.metadevs.OOP.OOP1;

import com.metadevs.OOP.OOP2.Worker;

public class Person implements Worker {
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
        lastName = "Absent name";
        salary = 0;
    }

    public Person() {
    }

    public Person(int age, String name, String lastName) {
        setAge(age);
        setName(name);
        setLastName(lastName);
    }

    @Override
    public void setAge(int age) {
        ageValidate(age);
        this.age = age;
    }

    @Override
    public void ageValidate(int age) throws AgeIsLessThen18Exception {
        if (age < 18) {
            throw new AgeIsLessThen18Exception("Возвраст сотрудника меньше 18-ти лет!");
        }
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setSalary(double salary) {
        salaryValidate(salary);
        this.salary = salary;
    }

    @Override
    public void salaryValidate(double salary) throws SalaryIsLessThen0Exception {
        if (salary < 0) {
            throw new SalaryIsLessThen0Exception("Зарплата сотрудника(цы) меньше нуля!");
        }
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public static void renameCompany(String newCompanyName) {
        companyName = newCompanyName;
    }

    public boolean isSalaryNotLessThenAge() {
        return getSalary() >= getAge();
    }

    public static void salaryValidate(Person person) throws SalaryLessOrEqualThenAgeException {
        if (!(person.isSalaryNotLessThenAge())) {
            throw new SalaryLessOrEqualThenAgeException("ВНИМАНИЕ! Зарплата сотрудника(цы) меньше или ровна его(её) возврасту! СРОЧНО ПОВЫСЬТЕ ЗАРПЛАТУ!!!");
        }
        System.out.println("Порядок. Зарплата сотрудника(цы) не меньше его(её) возвраста.");
    }

    public static void main(String[] args) {
        Person bob = new Person(28, "Bob", "Dylan");
        Person alex = new Person(18, "Alex", "Navalny");

        Company Metadevs = new Company("Metadevs");
        Metadevs.hirePerson(alex, 300000);
        Metadevs.hirePerson(bob, 200);
        Metadevs.printAllPerson();
        salaryValidate(bob);
    }
}