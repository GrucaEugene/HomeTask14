package com.technical.eleven.ui;

import com.technical.eleven.items.Human;

import java.util.List;
import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {
    private final Scanner sc;

    public HumanConsoleUI(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public String readSurname() {
        System.out.println("Enter a surname");
        return sc.nextLine();
    }

    @Override
    public String readName() {
        System.out.println("Enter a name");
        return sc.nextLine();
    }

    @Override
    public Human readHuman() {
        System.out.println("Enter surname of Human");
        String surname = sc.nextLine();

        System.out.println("Enter name of Human");
        String name = sc.nextLine();

        System.out.println("Enter patronymic of Human");
        String patronymic = sc.nextLine();

        return new Human(surname, name, patronymic);
    }

    @Override
    public int getIndexOfHuman() {
        System.out.println("Enter the number of Human");
        int number = sc.nextInt();
        return number - 1;

    }

    @Override
    public void showHumans(List<Human> humans) {
        for (int i = 0; i < humans.size(); i++) {
            System.out.println(i + 1 + ". " + humans.get(i));
        }
    }

    @Override
    public void showHumanExistsError(Human human) {
        System.err.println("Human: " + human + " already exists!!!");
    }

    @Override
    public void showHumanNotExistsError(int number) {
        System.err.println("Human with number " + (number + 1) + " doesn't exist!");
    }

    @Override
    public void showHumanNotFoundError(String searchValue, String searchParam) {
        System.err.println("Human with " + searchParam + " \"" + searchValue + "\" doesn't exist!");
    }

    @Override
    public void showHuman(Human human) {
        System.out.println(human);
    }

}
