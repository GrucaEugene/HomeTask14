package com.technical.eleven.exceptions;

public class HumanNotFoundException extends Exception {
    private String searchValue;

    public HumanNotFoundException(String searchValue){
        super();
        this.searchValue = searchValue;
    }

    public String getSearchValue() {
        return searchValue;
    }
}
