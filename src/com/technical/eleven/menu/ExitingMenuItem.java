package com.technical.eleven.menu;

import com.technical.eleven.menu.MenuItem;

public class ExitingMenuItem extends MenuItem {

    public ExitingMenuItem() {
        super(null, "Go out", true);
    }

    @Override
    public void exec() {
        System.out.println("Bye bye!");
    }
}
