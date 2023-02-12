package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Floating;
import model.interfaceClass.Runable;

public class Turtle extends Herbivores implements Runable, Floating {
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Ква- \uD83D\uDC22 -Ква";
    }

    @Override
    public int getFloatingSpeed() {
        return 15;
    }

    @Override
    public int getImmersionDepth() {
        return 30;
    }

    @Override
    public int getSpeedRun() {
        return 6;
    }
}
