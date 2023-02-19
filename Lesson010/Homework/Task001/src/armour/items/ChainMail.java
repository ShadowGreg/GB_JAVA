package armour.items;

import armour.Armour;

public class ChainMail extends Armour {
    private final int maxArm = 15;

    @Override
    public int Protected() {
        return maxArm;
    }

    @Override
    public String toString() {
        return " ChainMail{ "
                + "Protection=" + Protected()
                + '}';
    }
}
