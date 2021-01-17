package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

public class AddHumanMenuItem extends MenuItem {

    public AddHumanMenuItem(HumanController humanController) {
        super(humanController, "Add human");
    }

    @Override
    public void exec() {
        humanController.addHuman();
    }
}
