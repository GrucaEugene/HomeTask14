package com.technical.eleven.services;

import com.technical.eleven.main.items.Human;

import java.util.List;

public interface HumanService {

    Human findBySurname(String surname);
    Human findByName(String name);
    List<Human> getWholeList();
    void addHuman(Human human);
    void removeHumanByNumber(int number);
    }
