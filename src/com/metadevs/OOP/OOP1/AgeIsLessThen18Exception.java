package com.metadevs.OOP.OOP1;

public class AgeIsLessThen18Exception extends RuntimeException{
    public AgeIsLessThen18Exception() {}

    public AgeIsLessThen18Exception(String errorMessage) {
        super(errorMessage);
    }
}