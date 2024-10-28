import java.util.Arrays;
import java.util.Scanner;

public class Apr18_Arrays {
    public static void main(String[] args) {
//        int[] double[]
//        int[] nums = {1, 2, 3};


//        int[] nums = new int[10];

//        System.out.println(Arrays.toString(nums));

        String answer = "japan";

        String[] guess = new String[answer.length()];

        while (true) {
            System.out.println(Arrays.toString(guess));

//        userInput = a
//        String userInput = "a"; //char[]
//        char a = 'a';
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess a letter: ");
            String userInput = sc.nextLine();

//        System.out.println(userInput.equals(a));
            for (int i = 0; i < answer.length(); i++) {
//            userInput == answer[i]
                if (userInput.equals(String.valueOf(answer.charAt(i)))) {
//                System.out.println("found a");
//                replace character null at index i if match
                    guess[i] = userInput;
                }
            }

            System.out.println(Arrays.toString(guess));
        }
    }
}
