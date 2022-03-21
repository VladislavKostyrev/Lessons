package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.Person;

public interface IdealCompany {
    void hirePerson(Person person, double salary);
    void firePerson(Person person);
    void printAllPerson();
    default void printMessage() {
        System.out.println("This is message from Idealcompany default method ");
    }
}