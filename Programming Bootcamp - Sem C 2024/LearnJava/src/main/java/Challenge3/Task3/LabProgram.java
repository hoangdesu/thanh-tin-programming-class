package Challenge3.Task3;

import java.util.Scanner;

public class LabProgram {
    public static void main(String args[]) {
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

        int goal = -1;
        int round = 0;

        die1.roll();
        die2.roll();
        int diceTotal = die1.getValue() + die2.getValue();
        System.out.printf("Dice total: %d\n", diceTotal);
//        System.out.println(die1.getValue());
//        System.out.println(die2.getValue());
//        System.out.printf("Dice total: %d\n", diceTotal);

//            if first roll is not win or lose, continue rolling until we hit the goal (win) or 7 (lose)

        if (diceTotal == 7 || diceTotal == 11) {
            credits++;
            System.out.println("Credits: " + credits);
        } else if (diceTotal == 2 || diceTotal == 3 || diceTotal == 12) {
            credits--;
            System.out.println("Credits: " + credits);
        } else {
            goal = diceTotal;
        }

        round++;

        if (goal != -1) {
            while (true) {
                die1.roll();
                die2.roll();
                diceTotal = die1.getValue() + die2.getValue();
                System.out.printf("Dice total: %d\n", diceTotal);

                if (diceTotal == 7) {
                    credits--;
                    System.out.println("Credits: " + credits);
                    System.out.println("Rounds: " + round);
                    break;
                } else if (diceTotal == goal) {
                    credits++;
                    System.out.println("Credits: " + credits);
                    System.out.println("Rounds: " + round);
                    break;
                }

                round++;
            }

        }





    }
}