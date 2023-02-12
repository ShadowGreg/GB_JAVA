package model.abstractClass;

public abstract class Predator extends Animal{
    public Predator(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "meat";
    }


}
