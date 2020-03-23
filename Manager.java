package com.company;

public class Manager  extends Person {



    public Manager(String name, String secondName, String telephone, String address, String dolznost, int oklad, int dayOfWork, int monthsOfWork) {
        super(name, secondName, telephone, address, dolznost, oklad, dayOfWork, monthsOfWork);


    }


    int k=2;
    public double pay() {
        return  k*daysOfWork*oklad/21;
    }



    public double rest() {
        return k*monthsOfWork*oklad/100;
    }

    @Override
    public String toString() {
        return "Manager{" +
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

