import java.util.Scanner;

public class Jan3_Loops {
    public static void main(String[] args) {
//        get user input: "happy new year!"
//        output:

//        -------------------
//        | happy new year! |
//        -------------------

//        get user input:
//        output: please enter a sentence: ...

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        while (message.isEmpty()) {
            System.out.print("Input is empty. Enter a message: ");
            message = scanner.nextLine();
        }

        for (int i = 0; i < message.length() + 4; i++) {
            System.out.print("-");
        }

        System.out.println("\n| " + message + " |");

        for (int i = 0; i < message.length() + 4; i++) {
            System.out.print("-");
        }
    }
}

// Input validation -> while
