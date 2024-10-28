package Mar23_ProgrammingChallenge2.Task2;

import java.util.Scanner;

public class WinningTeam {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Team team = new Team();

        String name = scnr.next();
        int wins = scnr.nextInt();
        int losses = scnr.nextInt();

        team.setName(name);
        team.setWins(wins);
        team.setLosses(losses);

        System.out.printf("Win percentage: %f\n", team.getWinPercentage());

        team.printStanding();
    }
}

