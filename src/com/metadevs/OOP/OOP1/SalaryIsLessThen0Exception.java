package com.metadevs.OOP.OOP1;

public class SalaryIsLessThen0Exception extends RuntimeException {
    public SalaryIsLessThen0Exception() {
    }

    public SalaryIsLessThen0Exception(String errorMessage) {
        super(errorMessage);
    }
}