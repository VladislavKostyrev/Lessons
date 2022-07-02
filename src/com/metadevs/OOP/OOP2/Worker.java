package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.AgeIsLessThen18Exception;
import com.metadevs.OOP.OOP1.SalaryLessOrEqualThenAgeException;

public interface Worker {
    public void setAge(int age);

    public void ageValidate(int age) throws AgeIsLessThen18Exception;

    public int getAge();

    public void setName(String name);

    public String getName();

    public void setLastName(String lastName);

    public String getLastName();

    public void setSalary(double salary);

    boolean isSalaryNotLessThenAge();

    public double getSalary();

    void salaryValidate() throws SalaryLessOrEqualThenAgeException;
}