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
    private final Random rnd = new Random();
    private final int maxUnitsCount = 100;

    private final Team<Warrior> firstLegion;
    private final Team<Warrior> secondLegion;

    public GameController() {
        firstLegion = generateTeam("First Legion");
        secondLegion = generateTeam("Second Legion");
        Battle<Team, Team> battleOfPydna
                = new Battle(firstLegion, secondLegion);
    }

    private Team<Warrior> generateTeam(final String name) {
        Team<Warrior> preparedTeam = new Team<>(name);
        for (int i = 0; i < rnd.nextInt(maxUnitsCount); i++) {
            preparedTeam.addWarrior(generateWarrior());
        }
        return preparedTeam;
    }

    private Warrior generateWarrior() {
        int randType = rnd.nextInt(2);
        return getNewWarriorItem(randType, new Names().getName());
    }

    private Warrior getNewWarriorItem(final int randType, final String name) {
        if (randType == 1) {
            return new Archer(
                    name,
                    new Bow()).addArmour(getArmor(rnd.nextInt(1))
            );
        }
        return new SwordMan(
                name,
                new Sword()).addArmour(getArmor(rnd.nextInt(1))
        );
    }

    private Armour getArmor(final int armIndex) {
        if (armIndex == 1) {
            return new Shield();
        }
        return new ChainMail();
    }
}
