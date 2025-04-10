package Challenge3.Task3;

import java.util.Scanner;
import java.util.Set;

public class LabProgram {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int credits;
        int seed;
        GVDie die1, die2;
        die1 = new GVDie();
        die2 = new GVDie();

        // Read random seed to support testing (do not alter)
        seed = scnr.nextInt();
        die1.setSeed(seed);

        // Read starting credits
        credits = scnr.nextInt();

        /* Insert your code here */
        int round = 0;
        while (credits > 0) {
            int goal = -1;

            die1.roll();
            die2.roll();
            int diceTotal = die1.getValue() + die2.getValue();
            System.out.println("Dice total: " + diceTotal);

//        first roll: win
            if (diceTotal == 7 || diceTotal == 11) {
                credits++;
                System.out.println("Credits: " + credits);
            } else if (Set.of(2, 3, 12).contains(diceTotal)) {
                // first roll: lose
                credits--;
                System.out.println("Credits: " + credits);
            } else {
//            start 2nd roll
                goal = diceTotal;
            }

//        start of second roll

            while (goal != -1) {
                die1.roll();
                die2.roll();
                diceTotal = die1.getValue() + die2.getValue();
                System.out.println("Dice total: " + diceTotal);

                if (diceTotal == 7) {
                    credits--;
                    goal = -1;
                    System.out.println("Credits: " + credits);
                } else if (diceTotal == goal) {
                    credits++;
                    goal = -1;
                    System.out.println("Credits: " + credits);
                }
            }

            round++;
        }

        System.out.println("Rounds: " + round);
    }
}