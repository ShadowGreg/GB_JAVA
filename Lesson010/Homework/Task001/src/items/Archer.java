package items;

import armour.Armour;
import weapons.Bow;

public class Archer extends Warrior<Bow, Armour> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon) {
        super(name, weapon);
        int delta = 10;

        distance = weapon.getDistance() + rnd.nextInt(delta);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{"
                + "distance=" + distance
                + '}';
    }
}
