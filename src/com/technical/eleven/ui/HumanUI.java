package com.technical.eleven.ui;

import com.technical.eleven.items.Human;

import java.util.List;

public interface HumanUI {


    String readSurname();
    String readName();
    Human readHuman();
    int getIndexOfHuman();
    void showHumans(List<Human> humans);
    void showHumanExistsError(Human human);
    void showHumanNotExistsError(int number);

    void showHumanNotFoundError(String searchValue, String searchParam);

    void showHuman(Human human);
}


