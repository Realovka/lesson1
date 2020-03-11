package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {
            System.out.println(" 1.Сколько штатов в США? ");
            System.out.println(" 2. Столица Норвегии? ");
            System.out.println(" 3. Сколько минут в часе? ");
            System.out.println(" 4. Кто открыл Америку ");
            System.out.println(" Введите номер вопроса ");
            Scanner scan=new Scanner(System.in);
            int number=scan.nextInt();
        } while (number<=4||  number>=1);

        switch (number) {
            case 1:
                System.out.println("Ответ : 50");
                break;
            case 2:
                System.out.println("Ответ :Осло");
                break;
            case 3:
                System.out.println("Ответ:60");
                break;
            case 4:
                System.out.println("Ответ :Колумб");
                break;
        }
    }
}



