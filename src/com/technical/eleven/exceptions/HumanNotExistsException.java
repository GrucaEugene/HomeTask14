package com.technical.eleven.exceptions;

public class HumanNotExistsException extends Exception {
    private final int number;

    public HumanNotExistsException(int number){
        super();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


}
