package armour.items;

import armour.Armour;

public class Helmet extends Armour {
    private final int maxArm = 3;

    @Override
    public int Protected() {
        return maxArm;
    }

    @Override
    public String toString() {
        return " Helmet{ "
                + "Protection=" + Protected()
                + '}';
    }
}
