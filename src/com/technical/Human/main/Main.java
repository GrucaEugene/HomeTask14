package com.technical.Human.main;

import com.technical.Human.Human;
import com.technical.Human.HumanService;

import java.util.Scanner;

public class Main {

    /*** Написать класс Human (фамилия, имя, отчество),

     переопределять в нем методы equals, hashCode, toString

     Написать класс HumanList (список людей) и класс HumanService (сервис по работе с людьми)

     Реализовать меню позволяющее

     добавить человека (если такой уже есть - вывести ошибку)
     вывести список
     удалить человека по номеру
     найти человека (людей) по фамилии
     найти человека по имени*/



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HumanService service = new HumanService();

        String choice;

        do {
            System.out.println("Если желаете добавить человека нажмите 1");
            System.out.println("Если желаете вывести список, нажмите 2");
            System.out.println("Если желаете удалить человека по номеру, нажмите 3");
            System.out.println("Если желаете найти человека (людей) по фамилии, нажмите 4");
            System.out.println("Если желаете найти человека по имени, нажмите 5");
            System.out.println("Если желаете завершить работу, нажмите 6");

            choice = sc.nextLine();

            switch (choice) {
                case "1" -> {
                    service.addHuman();
                }

                case "2" -> {
                    service.showWholeListOfHumans();
                }

                case "3" -> {
                    service.removeHumanByNumber();
                }

                case "4" -> {
                    service.findBySurname();
                }

                case "5" -> {
                    service.findByName();
                }

                case "6" -> {
                    System.out.println("Exiting");

                }
                default -> System.out.println("Wrong input. Error 404");
            }

        } while(!choice.equals("6"));




    }
}
