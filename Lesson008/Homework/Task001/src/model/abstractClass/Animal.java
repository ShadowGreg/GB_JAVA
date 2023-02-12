package model.abstractClass;

import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;
import model.interfaceClass.Sayable;

public abstract class Animal implements Sayable {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        StringBuilder srt = new StringBuilder();
        if (this instanceof Runable) {
            srt.append(" Скорость бега - > ").append(((Runable) this).getSpeedRun());
        }
        if (this instanceof Flyable) {
            srt.append(" Скорость полёта - > ").append(((Flyable) this).getSpeedFlyable());
        }
        return String.format(srt + " %s ест %s", this.name, this.feed());
    }
}
