package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;

import java.sql.SQLOutput;

public class FindByNameMenuItem extends MenuItem {

    public FindByNameMenuItem(HumanController humanController) {
        super(humanController, "Find a Human by name");
    }

    @Override
    public void exec() {
        System.out.println("--------------------------");
        System.out.println(humanController.findByName());
    }
}
