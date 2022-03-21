package com.metadevs.OOP.OOP2;

import com.metadevs.OOP.OOP1.Person;

public class Manager extends Person implements Worker {
    int activeProjects;
    int complitedProjects;

    Manager() {
    }

    Manager(int age, String name, String lastName, int aciveProjects, int complitedProjects) {
        super(age, name, lastName);
        this.activeProjects = aciveProjects;
        this.complitedProjects = complitedProjects;
    }
}