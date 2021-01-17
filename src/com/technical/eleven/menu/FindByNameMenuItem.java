package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;
import com.technical.eleven.menu.MenuItem;

public class FindByNameMenuItem extends MenuItem {

    public FindByNameMenuItem(HumanController humanController) {
        super(humanController, "Find a Human by name");
    }

    @Override
    public void exec() {
        humanController.findByName();
    }
}
