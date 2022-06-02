package com.metadevs.OOP.OOP1;

public class SalaryLessOrEqualThenAgeException extends RuntimeException {
    public SalaryLessOrEqualThenAgeException() {
    }

    public SalaryLessOrEqualThenAgeException(String errorMessage) {
        super(errorMessage);
    }
}