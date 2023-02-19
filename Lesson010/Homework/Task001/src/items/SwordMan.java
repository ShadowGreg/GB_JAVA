package items;

import armour.Armour;
import weapons.Sword;

public class SwordMan extends Warrior<Sword, Armour> {
    public SwordMan(String name, Sword weapon) {
        super(name, weapon);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}
