package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

public class FindBySurnameMenuItem extends MenuItem {

    public FindBySurnameMenuItem(HumanController humanController) {
        super(humanController, "Find a Human by surname");
    }

    @Override
    public void exec() {
        humanController.findBySurname();
    }
}
