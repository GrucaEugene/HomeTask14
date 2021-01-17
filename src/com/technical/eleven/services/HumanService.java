package com.technical.eleven.services;

import com.technical.eleven.lists.HumanList;
import com.technical.eleven.main.items.Human;
import com.technical.eleven.ui.HumanConsoleUI;
import com.technical.eleven.ui.HumanUI;

import java.util.Scanner;

public class HumanService {

    Scanner sc = new Scanner(System.in);
    HumanUI humanUI = new HumanConsoleUI(sc);

    private final HumanList humanList = new HumanList();

    public Human findBySurname(String surname) {
        Human result = null;
        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].getSurname().equals(surname)) {
                result = humanList.getAll()[i];
            }
        } return result;
    }

    public Human findByName(String name) {
        Human result = null;
        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].getName().equals(name)) {
                result = humanList.getAll()[i];
            }
        } return result;
    }

    public Human[] getWholeList() {
       return humanList.getAll();
    }

    public void addHuman(Human human) {

        for (int i = 0; i < humanList.getAll().length; i++) {
            if (humanList.getAll()[i].equals(human)) {
                System.out.println("This guy already exists");
                return;
            }
        }
        humanList.addToHumanList(human);
    }

    public void removeHumanByNumber(int number){

        if(number < 0 || number >= humanList.getAll().length){
            System.out.println("Wrong Number, try again!");
            return;
        }
        humanList.removeFromHumanListByIndex(number);

    }

}
