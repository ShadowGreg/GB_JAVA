package model.herbivores;

import model.abstractClass.Herbivores;
import model.interfaceClass.Flyable;

public class Cow extends Herbivores implements Flyable {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Муу - \uD83D\uDC2E - Муу";
    }

    @Override
    public int getSpeedFlyable() {
        return 13;
    }

    @Override
    public int getHigh() {
        return 2;
    }
}
