package Challenge2;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence or phrase:");
        String sentence = sc.nextLine();

        // If the input is empty, prompt the user again until a valid string is entered
        while (sentence.isEmpty()) {
            System.out.println("Invalid input. Please enter a valid string:");
            sentence = sc.nextLine();
        }

        System.out.println("\nYou entered: " + sentence);

        int charNum = getNumOfCharacters(sentence);
        System.out.println("Number of characters (excluding whitespace): " + charNum);

        String stringWithoutWhiteSpace = outputWithoutWhitespace(sentence);
        System.out.println("String without whitespace: " + stringWithoutWhiteSpace);

        int vowels = countVowels(sentence);
        System.out.println("Number of vowels: " + vowels);
    }

    public static int getNumOfCharacters(String s) {
        // excluding whitespace (spaces, tabs)
//        return s.length();

        int charNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i) != '\t') charNum++;
        }

        return charNum;
    }

    public static String outputWithoutWhitespace(String s) {
        StringBuilder strNoWhitespace = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '\t') {
                strNoWhitespace.append(c);
            }
        }

        return strNoWhitespace.toString();
    }

    public static int countVowels(String s) {
        int vowelCount = 0;
        Set<Character> vowels = Set.of('a', 'i', 'u', 'e', 'o');
//        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'i', 'u', 'e', 'o'));

        for (char c : s.toCharArray()) {
//            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
            if (vowels.contains(c)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
