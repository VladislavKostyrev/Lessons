package com.metadevs.OOP.OOP4;

import com.metadevs.OOP.OOP2.Worker;

abstract public class Citizen implements Worker {
    protected int age;
    protected String name;
    protected String lastName;

    public Citizen() {
    }

    public Citizen(int age, String name, String lastName) {
        setAge(age);
        setName(name);
        setLastName(lastName);
    }
}
