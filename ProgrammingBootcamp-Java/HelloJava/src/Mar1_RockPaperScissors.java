import java.util.Scanner;

public class Mar1_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = { "rock", "paper", "scissors" };

        int score = 0;

        System.out.println("--- Rock paper scissors game ---\n");

        while (true) {
            System.out.print("Enter your move: ");
            String player = sc.nextLine();

            if (player.equals("quit")) {
                System.out.println("gg!");
                break;
            }

            int randomIndex = (int) (Math.random() * moves.length); // type casting
            String computer = moves[randomIndex];
            System.out.println("Computer's move: " + computer);

            String winner = "";

            // nested if --> &&
            if (player.equals("rock")) {
                if (computer.equals(("rock"))) {
                    winner = "draw";
                } else if (computer.equals("paper")) {
                    winner = "computer";
                } else if (computer.equals("scissors")) {
                    winner = "player";
                }
            } else if (player.equals("paper")) {
                if (computer.equals(("rock"))) {
                    winner = "player";
                } else if (computer.equals("paper")) {
                    winner = "draw";
                } else if (computer.equals("scissors")) {
                    winner = "computer";
                }
            } else if (player.equals("scissors")) {
                if (computer.equals(("rock"))) {
                    winner = "computer";
                } else if (computer.equals("paper")) {
                    winner = "player";
                } else if (computer.equals("scissors")) {
                    winner = "draw";
                }
            }

            if (winner.equals("player")) {
                score++;
                System.out.println("> You win!");
            } else if (winner.equals("computer")) {
                score--;
                System.out.println("> Computer wins!");
            } else if (winner.equals("draw")) {
                System.out.println("> Draw!");
            }

            System.out.println("Your score: " + score);

            System.out.println("-------------\n");
        }

    }
}

//
//        Enter your move: rock
//        Computer's move: rock
//        > Draw!
//
//        Enter your move: rock
//        Computer's move: paper
//        > Computer wins!
//
//        Enter your move: scissors
//        Computer's move: paper
//        > You win!
