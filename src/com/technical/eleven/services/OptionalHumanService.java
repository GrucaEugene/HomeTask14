package com.technical.eleven.services;

import com.technical.eleven.main.items.Human;

import java.util.LinkedList;
import java.util.List;

public class OptionalHumanService implements HumanService {

    private final List<Human> humanList = new LinkedList<>();

    @Override
    public Human findBySurname(String surname) {
        Human result = null;
        for (Human human : humanList) {
            if (human.getSurname().equals(surname)) {
                result = human;
            }
        }
        return result;
    }

    @Override
    public Human findByName(String name) {
        Human result = null;
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                result = human;
            }
        }
        return result;
    }

    @Override
    public List<Human> getWholeList() {
        return humanList;
    }

    @Override
    public void addHuman(Human human) {

        for (Human value : humanList) {
            if (value.equals(human)) {
                System.out.println("This guy already exists");
                return;
            }
        }
        humanList.add(human);
    }

    @Override
    public void removeHumanByNumber(int number) {

        if (number < 0 || number >= humanList.size()) {
            System.out.println("Wrong Number, try again!");
            return;
        }
        humanList.remove(number);

    }

}
