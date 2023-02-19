package armour.items;

import armour.Armour;

public class Shield extends Armour {
    @Override
    public int Protected() {
        return 5;
    }

    @Override
    public String toString() {
        return " Shield{ "
                + "Protection=" + Protected()
                + '}';
    }
}
