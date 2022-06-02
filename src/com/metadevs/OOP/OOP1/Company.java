package com.metadevs.OOP.OOP1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String companyName;
    public List<Person> personList = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    public void hirePerson(Person person, double salary) {
        personList.add(person);
        person.setSalary(salary);
    }

    public void firePerson(Person person) {
        personList.remove(person);
        person.setSalary(0);
    }

    public void printAllPerson() {
        for (Person person : personList)
            System.out.println(person.getName() + " " + person.getLastName());
    }
}