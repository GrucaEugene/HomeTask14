package com.technical.eleven.exceptions;

import com.technical.eleven.items.Human;

public class HumanExistsException extends Exception{

    public HumanExistsException (Human human){
        super();
        this.human = human;
    }

    public Human getHuman() {
        return human;
    }

    private Human human;

}
