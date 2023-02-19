package controller;

import team.Team;

public class Battle<T1 extends Team, T2 extends Team> {
    public Battle(T1 firstTeam, T2 secondTeam) {
        while (firstTeam.isTeamGaveUp() && secondTeam.isTeamGaveUp()) {
            personalFight(firstTeam, secondTeam);
        }
        if (firstTeam.isTeamGaveUp())
            printGloriousNames(secondTeam);
        else
            printGloriousNames(firstTeam);
    }

    private void personalFight(Team firstTeam, Team secondTeam) {
        firstTeam.getRandomWarrior().hitDamage(secondTeam.getRandomWarrior());
        firstTeam.checkingTeamStatus();
        secondTeam.checkingTeamStatus();

        secondTeam.getRandomWarrior().hitDamage(firstTeam.getRandomWarrior());
        firstTeam.checkingTeamStatus();
        secondTeam.checkingTeamStatus();
    }

    private void printGloriousNames(Team team) {
        System.out.printf("%s Victory!\n", team.getName());
        System.out.println("Names of heroes are:");
        System.out.println(team);
    }
}
