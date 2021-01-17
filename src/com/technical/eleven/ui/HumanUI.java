package com.technical.eleven.ui;

import com.technical.eleven.main.items.Human;

public interface HumanUI {


    String readSurname();
    String readName();
    Human readHuman();
    int getIndexOfHuman();
    void showHumans(Human[] humans);

}


