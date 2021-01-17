package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

public class RemoveHumanMenuItem extends MenuItem {

    public RemoveHumanMenuItem(HumanController humanController) {
        super(humanController, "Remove human by number");
    }

    @Override
    public void exec() {
        humanController.removeFromList();
    }
}
