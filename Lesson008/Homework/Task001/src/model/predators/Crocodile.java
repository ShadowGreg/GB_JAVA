package model.predators;

import model.abstractClass.Predator;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;

public class Crocodile extends Predator implements Runable, Flyable {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Сшш - \uD83D\uDC0A - Сшш";
    }

    @Override
    public int getSpeedFlyable() {
        return 15;
    }

    @Override
    public int getHigh() {
        return 5;
    }

    @Override
    public int getSpeedRun() {
        return 100;
    }
}
