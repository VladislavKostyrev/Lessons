package com.metadevs.OOP.OOP1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    String companyName;
    private List<Person> personList = new ArrayList<>();

    Company (String companyName){
        this.companyName = companyName;
    }

    public void hirePerson(Person person) {
        personList.add(person);
    }

    public void firePerson(Person person) {
        personList.remove(person);
    }

    public void printAllPerson() {
        for(Person person : personList)
            System.out.println(person.getName() + " " + person.getLastName());
    }
}