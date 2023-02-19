package armour.items;

import armour.Armour;

public class ChainMail extends Armour {
    @Override
    public int Protected() {
        return 15;
    }

    @Override
    public String toString() {
        return " ChainMail{ " +
                "Protection=" + Protected() +
                '}';
    }
}
