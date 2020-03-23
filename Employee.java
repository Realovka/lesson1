package com.company;

import java.util.Scanner;

public class Employee extends Person {
    public Employee(String name, String secondName, String telephone, String address, String dolznost, int oklad, int daysOfWork, int monthsOfWork) {
        super(name, secondName, telephone, address, dolznost, oklad, daysOfWork, monthsOfWork);
    }


    @Override
    public double pay() {
        return daysOfWork * oklad / 21;

    }


    @Override
    public double rest() {
        return monthsOfWork*oklad / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", dolznost='" + dolznost + '\'' +
                ", oklad=" + oklad +
                ", daysOfWork=" + daysOfWork +
                ", monthsOfWork=" + monthsOfWork +
                '}';
    }
}








