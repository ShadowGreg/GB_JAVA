package model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Bulldogka {
    String breed = "";
    String name = "";


    public Bulldogka(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void isCondition() {
        int num = (int) (Math.random() * ((4 - 1) + 1)+1);
        System.out.println(num);
        if (num == 1)
            isHungry();
        else if (num == 2) {
            isSleep();
        } else if (num == 3) {
            isDirty();
        } else {
            isOk();
        }
    }

    public void isHungry() {
        System.out.format("%s %s Я голоден \n", breed, name);
    }

    public void isSleep() {
        System.out.format("%s %s Я сплю  \n", breed, name);
    }

    public void isDirty() {
        System.out.format("%s %s Я грязный \n", breed, name);
    }

    public void isOk() {
        System.out.format("%s %s всё хорошо \n", breed, name);
    }

    @Override
    public String toString() {
        return String.format(" %s %s \n", breed, name);
    }
}
