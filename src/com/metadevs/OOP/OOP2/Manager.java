package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.AgeIsLessThen18Exception;
import com.metadevs.OOP.OOP1.SalaryLessOrEqualThenAgeException;

public class Manager implements Worker {
    private int age;
    private String name;
    private String lastName;
    private double salary;
    int countActiveProjects;
    int countCompletedProjects;

    Manager() {
    }

    Manager(int age, String name, String lastName, int activeProjects, int completedProjects) {
        setAge(age);
        setName(name);
        setLastName(lastName);
        this.countActiveProjects = activeProjects;
        this.countCompletedProjects = completedProjects;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void salaryValidate() throws SalaryLessOrEqualThenAgeException {
        if (!(isSalaryNotLessThenAge())) {
            throw new SalaryLessOrEqualThenAgeException("ВНИМАНИЕ! Зарплата сотрудника(цы) меньше или ровна его(её) возрасту! СРОЧНО ПОВЫСЬТЕ ЗАРПЛАТУ!!!");
        }
        System.out.println("Порядок. Зарплата сотрудника(цы) не меньше его(её) возраста.");
    }

    @Override
    public void setAge(int age) {
        ageValidate(age);
        this.age = age;
    }

    @Override
    public void ageValidate(int age) throws AgeIsLessThen18Exception {
        if (age < 18) {
            throw new AgeIsLessThen18Exception("Возраст сотрудника меньше 18-ти лет!");
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setSalary(double salary) {
        salaryValidate();
        this.salary = salary;
    }

    @Override
    public boolean isSalaryNotLessThenAge() {
        return getSalary() >= getAge();
    }
}