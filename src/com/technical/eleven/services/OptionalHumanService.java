package com.technical.eleven.services;

import com.technical.eleven.exceptions.HumanExistsException;
import com.technical.eleven.exceptions.HumanNotExistsException;
import com.technical.eleven.exceptions.HumanNotFoundException;
import com.technical.eleven.items.Human;

import java.util.LinkedList;
import java.util.List;

public class OptionalHumanService implements HumanService {

    private final List<Human> humanList = new LinkedList<>();

    @Override
    public Human findBySurname (String surname) throws HumanNotFoundException {
        for (Human human : humanList) {
            if (human.getSurname().equals(surname)) {
                return human;
            }
        }
        throw new HumanNotFoundException(surname);
    }

    @Override
    public Human findByName (String name) throws HumanNotFoundException {
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
               return human;
            }
        }
        throw new HumanNotFoundException(name);
    }

    @Override
    public List<Human> getWholeList() {
        return humanList;
    }

    @Override
    public void addHuman(Human human) throws HumanExistsException {

        for (Human value : humanList) {
            if (value.equals(human)) {
                throw new HumanExistsException(human);
            }
        }
        humanList.add(human);
    }

    @Override
    public void removeHumanByNumber(int number) throws HumanNotExistsException {

        if (number < 0 || number >= humanList.size()) {
            throw new HumanNotExistsException(number);
        }
        humanList.remove(number);

    }

}
