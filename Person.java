package com.company;

import java.util.Scanner;

public abstract class Person {


    String name;
    String secondName;
    String telephone;
    String address;
    String dolznost;
    int oklad;
    int daysOfWork;
    int monthsOfWork;


    public Person(String name, String secondName, String telephone, String address, String dolznost, int oklad, int daysOfWork, int monthsOfWork) {
        this.name = name;
        this.secondName = secondName;
        this.telephone = telephone;
        this.address = address;
        this.dolznost = dolznost;
        this.oklad = oklad;
        this.daysOfWork=daysOfWork;
        this.monthsOfWork=daysOfWork;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDolznost() {
        return dolznost;
    }

    public void setDolznost(String dolznost) {
        this.dolznost = dolznost;
    }

    public int getOklad() {
        return oklad;
    }

    public void setOklad(int oklad) {
        this.oklad = oklad;
    }

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public int getMonthsOfWork() {
        return monthsOfWork;
    }

    public void setMonthsOfWork(int monthsOfWork) {
        this.monthsOfWork = monthsOfWork;
    }

    public abstract double pay();

    public abstract double rest();




}

