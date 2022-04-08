package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.Person;

public interface IdealCompany {
    public void hirePerson(Person person, double salary);

    public void firePerson(Person person);

    public void printAllPerson();

    public default void printMessage() {
        System.out.println("This is message from Idealcompany default method ");
    }
}