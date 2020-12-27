package com.technical.Human;

import java.util.Arrays;
import java.util.List;

public class HumanList{

    Human[] humanArray = new Human[0];

    public void addToHumanList(Human human){
        Human[] copy = new Human[humanArray.length + 1];
        for (int i = 0; i < humanArray.length; i++) {
            copy[i] = humanArray[i];
        }
        copy[copy.length-1] = human;
        humanArray = copy;

    }

    public void removeFromHumanListByIndex(int index){
        Human[] copy = new Human[humanArray.length - 1];
        for (int i = 0, j = 0; i < humanArray.length; i++) {
            if(i == index){
                continue;
            }
            copy[j] = humanArray[i];
            j++;
        }
        humanArray = copy;
    }

    public Human[] getAll(){
        return humanArray;
    }

}
