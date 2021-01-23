package com.technical.eleven.services;

import com.technical.eleven.exceptions.HumanExistsException;
import com.technical.eleven.exceptions.HumanNotExistsException;
import com.technical.eleven.exceptions.HumanNotFoundException;
import com.technical.eleven.items.Human;

import java.util.List;

public interface HumanService {

    Human findBySurname(String surname) throws HumanNotFoundException;
    Human findByName(String name) throws HumanNotFoundException;
    List<Human> getWholeList();
    void addHuman(Human human) throws HumanExistsException;
    void removeHumanByNumber(int number) throws HumanNotExistsException;
    }
