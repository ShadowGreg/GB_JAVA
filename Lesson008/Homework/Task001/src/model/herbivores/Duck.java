package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Floating;
import model.interfaceClass.Flyable;
import model.interfaceClass.Runable;

public class Duck extends Herbivores implements Flyable, Runable, Floating {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кря- \uD83E\uDD86 -Кря";
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
        return 10;
    }

    @Override
    public int getFloatingSpeed() {
        return 2;
    }

    @Override
    public int getImmersionDepth() {
        return 1;
    }
}
