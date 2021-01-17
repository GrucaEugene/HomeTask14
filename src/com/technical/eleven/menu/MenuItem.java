package com.technical.eleven.menu;

import com.technical.eleven.controllers.HumanController;
import com.technical.eleven.ui.HumanConsoleUI;
import com.technical.eleven.ui.HumanUI;

import java.util.Scanner;

public abstract class MenuItem {
    Scanner sc = new Scanner(System.in);
    HumanUI humanUI = new HumanConsoleUI(sc);
    protected HumanController humanController;
    private String name;
    private boolean closeAfter;

    public MenuItem(HumanController humanController, String name, boolean closeAfter) {
        this.humanController = humanController;
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public MenuItem(HumanController humanController, String name) {
        this(humanController, name, false);
    }

    public String getName() {
        return name;
    }

    public abstract void exec();

    public boolean closeAfter() {
        return closeAfter;
    }
}
