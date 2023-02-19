package team;

import items.DistanceAttacker;
import items.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Warrior> {
    private final Random rnd = new Random();
    private final List<T> team = new ArrayList<>();


    private final String name;
    private final int gaveUpNum = 110;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }

    public Warrior getRandomWarrior() {
        return team.get(rnd.nextInt(team.size()));
    }

    public void checkingTeamStatus() {
        for (int i = 0; i < team.size(); i++) {
            if (0 >= team.get(i).getHealthPoint()) {
                team.remove(i);
            }
        }
    }

    public boolean isTeamGaveUp() {
        int sum = 0;
        for (Warrior item : team) sum += item.getHealthPoint();
        if (sum > gaveUpNum)
            return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) {
            teamBuilder.append(item.toString() + "\n");
        }
        return String.format(
                "Team{ team= %s, maxDistance = %d, maxDamage = %d \n%s}",
                name,
                getMaxDistance(),
                getTeamDamage(),
                teamBuilder
        );
    }
}
