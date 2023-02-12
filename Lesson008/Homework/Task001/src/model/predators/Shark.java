package model.predators;

import model.abstractClass.Herbivores;
import model.interfaceClass.Floating;

public class Shark extends Herbivores implements Floating {

    public Shark(String name) {super(name);}

    @Override
    public int getFloatingSpeed() {
        return 102;
    }

    @Override
    public int getImmersionDepth() {
        return 12;
    }

    @Override
    public String say() {
        return "\uD83C\uDF0A- \uD83E\uDD88 -\uD83C\uDF0A";
    }
}
