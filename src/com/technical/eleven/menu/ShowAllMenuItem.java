package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

public class ShowAllMenuItem extends MenuItem {

    public ShowAllMenuItem(HumanController humanController) {
        super(humanController, "Show Whole List");
    }

    @Override
    public void exec() {
        System.out.println("----------Whole List-------------");
        humanController.showAllHumans();

    }
}
