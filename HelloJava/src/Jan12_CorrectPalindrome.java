import java.util.Scanner;

public class Jan12_CorrectPalindrome {
    public static void main(String[] args) {
        String sentence = "!*&^*&^*^&*&^ ,.,.,.;;,;,;* 1 a s (*&(*&(*&(*& anta     at NA )(*)(*)(*SA 1";
//        sentence = "12321";
        int head = 0;
        int tail = sentence.length() - 1;

        boolean isPalindrome = true;

        while (head < sentence.length() / 2) {
            // char
            char headChar = sentence.charAt(head);
            char tailChar = sentence.charAt(tail);
            // bước tiếp theo kiểm tra headChar và tailChar có phải là ký tự đặc biệt hay không
            // Nếu là ký tự đặc biệt -> di chuyển cái index của head lên và index của tail xuống
            // Update headChar và taiChair theo index mới
            while (!Character.isAlphabetic(headChar)) {
                head++;
                headChar = sentence.charAt(head);
            }

            while (!Character.isAlphabetic(tailChar)) {
                tail--;
                tailChar = sentence.charAt(tail);
            }

            System.out.println("headChar: " + headChar + " - tailChar: " + tailChar);
            // quy ve 11 chuan de de kiem tra ==> lower case
            if (Character.toLowerCase(headChar) != Character.toLowerCase(tailChar)) {
                isPalindrome = false;
                break;
            }
            // update head vaf tail
            head++;
            tail--;
        }
        System.out.println("sentence: " + sentence);
        if(isPalindrome){
            System.out.println("the sentence is a palindrome");
        }else {
            System.out.println("The sentence is not a palindrone.");
        }
//   // cach 3 : split sring
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//        String seentence = sc.nextLine();
//




    }

}