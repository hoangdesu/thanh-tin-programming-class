import java.util.Scanner;

public class Jan9_StringMethods {
    public static void main(String[] args) {
        // Palindrome

//        ab | ba -> true
//        m o m -> true
//        hello -> false

//        Level 1: check words

//        Enter a word: abba
//        -> abba is a palindrome
//
//        Enter a word: hello:
//        -> hello is NOT a palindrome
//
//        hint:
//        - for
//        - charAt(index)

//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Enter a word: ");
//            String txt = sc.nextLine();
//
//            while (txt.isEmpty()) {
//                System.out.print("Missing. Please enter a word: ");
//                txt = sc.nextLine();
//            }
//
//            if (txt.equals("quit")) {
//                System.out.println("Bye bye!");
//                break;
//            }
//
//            boolean isPalindrome = true;
//            int tail = txt.length() - 1;
//
//            for (int i = 0; i < txt.length() / 2; i++) {
//                if (txt.charAt(i) != txt.charAt(tail)) {
//                    isPalindrome = false;
//                    break;
//                }
//                tail--;
//            }
//
//            if (isPalindrome) {
//                System.out.println(txt + " is a palindrome");
//            } else {
//                System.out.println(txt + " is NOT a palindrome");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // assume this string IS palindrome
        boolean isPalindrome = true;

        for (int head = 0; head < word.length()/2; head++) {
            int tail = word.length() - 1 - head;

//            System.out.println("head: " + word.charAt(head) + " - tail: " + word.charAt(tail));

            // neu 1 cap ko match, thi ket luan string nay ko phai la palindrome
            if (word.charAt(head) != word.charAt(tail)) {
                isPalindrome = false;
                break;
            }

//            System.out.println(word.charAt(i));
//            System.out.println(word.charAt(word.length() - 1));
//            System.out.println(word.charAt(word.length() - 2));

        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }

//        sử dụng 1 cặp head và tail pointers để keep track 2 values

    }
}
