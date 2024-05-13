package prereq;

import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {      
      // STEP 1: Read the number of words into an integer

      // STEP 2: Read the words, one-at-a-time into an ArrayList

      // STEP 3: Find the number of times the *first* word appears in the ArrayList.
      //         Print out this number in the required format.

      // STEP 4: Question - What do you need to change in your Step 3 code
      //                    to find the number of times the *second* word
      //                    appears in the ArrayList?
      //         Question - What about the *third* word?
      //         Question - Do you see a pattern emerging?

      // STEP 5: Turn your code in Step 3 into a loop that checks every word in the ArrayList

      Scanner sc = new Scanner(System.in);

      System.out.print("What is your name: ");
      String name = sc.nextLine();

      System.out.println("Hello " + name);
   }
}