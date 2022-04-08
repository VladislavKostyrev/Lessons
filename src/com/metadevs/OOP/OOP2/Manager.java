package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.Person;

public class Manager extends Person implements Worker {
    int countActiveProjects;
    int countComplitedProjects;

    Manager() {
    }

    Manager(int age, String name, String lastName, int aciveProjects, int complitedProjects) {
        super(age, name, lastName);
        this.countActiveProjects = aciveProjects;
        this.countComplitedProjects = complitedProjects;
    }
}