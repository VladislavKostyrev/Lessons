package com.metadevs.OOP.OOP1;

import com.metadevs.OOP.OOP2.IdealCompany;

import java.util.ArrayList;
import java.util.List;

public class Company implements IdealCompany {
    String companyName;
    private List<Person> personList = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void hirePerson(Person person, double salary) {
        personList.add(person);
        person.setSalary(salary);
    }

    @Override
    public void firePerson(Person person) {
        personList.remove(person);
        person.setSalary(0);
    }

    @Override
    public void printAllPerson() {
        for (Person person : personList)
            System.out.println(person.getName() + " " + person.getLastName());
    }
}