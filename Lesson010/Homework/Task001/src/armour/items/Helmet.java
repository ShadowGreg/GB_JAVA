package armour.items;

import armour.Armour;

public class Helmet extends Armour {
    @Override
    public int Protected() {
        return 3;
    }

    @Override
    public String toString() {
        return " Helmet{ " +
                "Protection=" + Protected() +
                '}';
    }
}
