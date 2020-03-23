package com.company;

import java.io.OutputStream;
import java.util.Scanner;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public Main() {
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", "Иванов", "1111111", "Ульяновская-49", "логист", 1000, 19, 6);
        Employee employee2 = new Employee("Федор", "Федоров", "111122", "Ленина-5", "старший логист", 2000, 15, 8);
        Manager manager1 = new Manager("Петр", "Петров", "2222222", "50летВЛКСМ-18", "директор", 5000, 22,12);
        Manager manager2 = new Manager("Василий", "Бублик", "2223311", "60летОктября-3", "ген директор", 8000, 12,3);
        Person persons[] = new Person[4];
        persons[0] = employee1;
        persons[1] = employee2;
        persons[2] = manager1;
        persons[3] = manager2;
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Зарплата сотрудника "+employee1.name+" "+employee1.secondName+" за "+employee1.daysOfWork+ " дней равна "+ employee1.pay()+" рублей");
        System.out.println("Зарплата сотрудника "+employee2.name+" "+employee2.secondName+" за "+employee2.daysOfWork+  " дней равна "+ employee2.pay()+ " рублей");
        System.out.println("Зарплата сотрудника "+manager1.name+" "+manager1.secondName+" за "+manager1.daysOfWork+  " дней равна "+ manager1.pay()+"рублей");
        System.out.println("Зарплата сотрудника "+manager2.name+" "+manager2.secondName+" за "+manager2.daysOfWork+" дней равна "+ manager2.pay()+"рублей");
        System.out.println();
        System.out.println("Отпускные сотрудника "+employee1.name+" "+employee1.secondName+" равны "+ employee1.rest()+" рублей");
        System.out.println("Отпускные сотрудника "+employee2.name+" "+employee2.secondName+" равны "+ employee2.rest()+" рублей");
        System.out.println("Отпускные сотрудника "+manager1.name+" "+manager1.secondName+" равны "+ manager1.rest()+" рублей");
        System.out.println("Отпускные сотрудника "+manager2.name+" "+manager2.secondName+" равны "+ manager2.rest()+" рублей");


    }

}



