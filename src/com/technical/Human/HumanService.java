package com.technical.Human;

import java.util.Scanner;

public class HumanService {

    Scanner sc = new Scanner(System.in);

    private final HumanList humanList = new HumanList();

    public void findBySurname() {

        System.out.println("Введите фамилию");
        String surname = sc.nextLine();

        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].getSurname().equals(surname)) {
                System.out.println(humanList.getAll()[i]);
            }
        }
    }

    public void findByName() {

        System.out.println("Введите имя");
        String name = sc.nextLine();

        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].getName().equals(name)) {
                System.out.println(humanList.getAll()[i]);
            }
        }
    }

    public void showWholeListOfHumans() {
        for (int i = 0; i < humanList.getAll().length; i++) {

            System.out.println(i + 1 + ". "+humanList.getAll()[i]);
        }
    }

    public void addHuman() {

        System.out.println("Enter surname of Human");
        String surname = sc.nextLine();

        System.out.println("Enter name of Human");
        String name = sc.nextLine();

        System.out.println("Enter patronymic of Human");
        String patronymic = sc.nextLine();

        Human human = new Human(surname, name, patronymic);

        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].equals(human)) {
                System.out.println("This guy already exists");
                return;
            }
        }

        humanList.addToHumanList(human);
    }

    public void removeHumanByNumber(){
        System.out.println("Введите номер человека");
        int number = sc.nextInt();
        int index = number - 1;
        if(index < 0 || index >= humanList.getAll().length){
            System.out.println("Wrong Number, try again!");
            return;
        }

        humanList.removeFromHumanListByIndex(number-1);

    }

}
