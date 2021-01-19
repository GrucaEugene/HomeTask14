package com.technical.eleven.menu;

public class ExitingMenuItem extends MenuItem {

    public ExitingMenuItem() {
        super(null, "Go out", true);
    }

    @Override
    public void exec() {
        System.out.println("Bye bye!");
    }
}
