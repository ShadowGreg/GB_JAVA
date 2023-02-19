package controller;

import armour.Armour;
import armour.items.ChainMail;
import armour.items.Shield;
import items.Archer;
import items.SwordMan;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

import java.util.Random;

public class GameController {
    private Random rnd = new Random();
    private int maxUnitsCount = 100;

    Team<Warrior> firstLegion;
    Team<Warrior> secondLegion;

    public GameController() {
        firstLegion = generateTeam("First Legion");
        secondLegion = generateTeam("Second Legion");
        Battle<Team, Team> battleOfPydna = new Battle(firstLegion, secondLegion);
    }

    private Team<Warrior> generateTeam(String name) {
        Team<Warrior> preparedTeam = new Team<>(name);
        for (int i = 0; i < rnd.nextInt(maxUnitsCount); i++) {
            preparedTeam.addWarrior(generateWarrior());
        }
        return preparedTeam;
    }

    private Warrior generateWarrior() {
        int randType = rnd.nextInt(1);
        return getNewWarriorItem(randType, new Names().getName());
    }

    private Warrior getNewWarriorItem(int randType, String name) {
        switch (randType) {
            case 0:
                return new Archer(name, new Bow()).addArmour(getArmor(rnd.nextInt(1)));
            default:
                return new SwordMan(name, new Sword()).addArmour(getArmor(rnd.nextInt(1)));
        }
    }

    private Armour getArmor(int armIndex) {
        switch (armIndex){
            case 0:
                return new Shield();
            default:
                return new ChainMail();
        }
    }
}
