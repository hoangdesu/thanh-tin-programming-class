public class Jan10_Palindrome2 {
    public static void main(String[] args) {
//        Level 2 - 3

//        madam I'm Adam
        String sentence = "A Santa !!!!!!!!!       at NASA";
//        sentence = "Hello world";

//        Character a = 'a';
//        System.out.println(Character.isAlphabetic('9'));
//                alpha numeric = a-z + A-z + 0-9

        // -----------------------------------------------------
//        cach 1: su dung ham build san isAlphabetic
//        Character: wrapper class. bao boc cai primitive data type "char"
//        Character.is

//        for (int i = 0; i < sentence.length(); i++) {
//            System.out.println(sentence.charAt(i) + ": " + Character.isAlphabetic(sentence.charAt(i)));
//            // logic
//        }

//        for (int head = 0; head < sentence.length() / 2; head++) {
//
//        }

//        while (head và tail phai la true)

        // index
        int head = 0;
        int tail = sentence.length() - 1;

        boolean isPalindrome = true;

        while (head < sentence.length() / 2) {
            // chars
            char headChar = sentence.charAt(head);
            char tailChar = sentence.charAt(tail);

            // kiem tra headChar va tailChar co phai la ky tu dac biet hay ko?
            // neu la ky tu dac biet -> di chuyen cai index cua head len va index cua tail xuong
            // update headChar va tailChar theo index moi

            while (!Character.isAlphabetic(headChar)) {
                head++;
                headChar = sentence.charAt(head);
            }

            while (!Character.isAlphabetic(tailChar)) {
                tail--;
                tailChar = sentence.charAt(tail);
            }

            System.out.println("headChar: " + headChar + " - tailChar: " + tailChar);

            // quy ve 1 chuan de kiem tra => lower case
            if (Character.toLowerCase(headChar) != Character.toLowerCase(tailChar)) {
                isPalindrome = false;
                break;
            }

            // update head and tail manually
            head++;
            tail--;
        }

        System.out.println("Sentence: " + sentence);
        if (isPalindrome) {
            System.out.println("The sentence is a palindrome");
        } else {
            System.out.println("The sentence is NOT a palindrome");
        }


        // -----------------------------------------------------
//            cach 1.2: su dung alphanumeric thay cho alphabetic
    //        ...

        // -----------------------------------------------------
//        cach 2: su dung ASCII
//        ord chr

//        char a = 'a'; // 67
//        System.out.println((int) a);

        // -----------------------------------------------------
//        cach 3: split strings


    }
}
