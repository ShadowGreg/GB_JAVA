package items;

import armour.Armour;
import armour.items.Helmet;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Warrior<T1 extends Weapon, T2 extends Armour> {
    private String name;
    protected T1 weapon;
    protected List<T2> armours;
    protected Random rnd = new Random();
    private int healthPoint;


    public Warrior(String name, T1 weapon) {
        this.name = name;
        this.weapon = weapon;
        healthPoint = 100;
        armours = new ArrayList<>();
        armours.add((T2) new Helmet());
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        int protectionSum = armours.stream().mapToInt(item -> item.Protected()).sum();
        this.healthPoint -= damage - protectionSum;
    }

    public int hitDamage(Warrior enemy) {
        int damage = 0;
        if (healthPoint > 0) {
            damage = rnd.nextInt(weapon.damage());
            enemy.reduceHealthPoint(damage);
        }
        return damage;
    }

    public Warrior addArmour(T2 arm) {
        armours.add(arm);
        return this;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    @Override
    public String toString() {
        StringBuilder armoursDescription = new StringBuilder();
        for (Armour item : armours) {
            armoursDescription.append(item.toString());
        }
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                ", Armours=" + armoursDescription +
                '}';
    }
}
