package com.technical.Human;

import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private String patronymic;

    public Human(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString(){
        return surname+" "+name+" "+patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
