public class Jan12_SplitStrings {
    public static void main(String[] args) {
//        a santa at nasa
//        asantaatnasa
//
//        first: "asanta"
//        second: "atnasa"
//        reversed_second: "asanta"

        String sentence = "Borrow or RoB??? =)))";
//        sentence = "a santa at Nasa!";
//        sentence = "hello world :D";

//        String formattedSentence =

//        A-Z: 65-90
//        a-z: 97-122

//        Typecasting: bien doi kieu du lieu
//        Co the type cast tu char sang int va nguoc lai

//        System.out.println((int) 'a'); // 97
//        System.out.println((char) 90); // int -> char: Z

        // lọc các ký tự mong muốn trong string
        StringBuilder formattedString = new StringBuilder("");

        for (int i = 0; i < sentence.length(); i++) {
            int charInt = (int) sentence.charAt(i);
            boolean isAlphabetic = false;

            if ((charInt >= 65 && charInt <= 90) || (charInt >= 97 && charInt <= 122)) {
                isAlphabetic = true;
            }

            if (isAlphabetic) {
//                System.out.println(sentence.charAt(i) + ": " + charInt);
                // quy het ve lowercase
                if (charInt >= 65 && charInt <= 90) {
                    charInt += 32;
                }
                formattedString.append((char) charInt);
            }
        }

        System.out.println(formattedString);

        String first = formattedString.substring(0, formattedString.length() / 2);

        int startIndexForSecondString = 1; // so le -> +1 len de bo chu cai giua
        if (formattedString.length() % 2 == 0) {
            startIndexForSecondString = 0; // so chan -> ko can cong
        }
        String second = formattedString.substring(formattedString.length() / 2 + startIndexForSecondString);

        StringBuilder reversedSecond = new StringBuilder("");
        for (int i = second.length() - 1; i >= 0; i--) {
            reversedSecond.append(second.charAt(i));
        }

        System.out.println("reversed second: " + reversedSecond);

        System.out.println("first: " + first + " - second: " + second);

        if (first.contentEquals(reversedSecond)) {
            System.out.println("The sentence is a palindrome");
        } else {
            System.out.println("The sentence is NOT a palindrome");
        }


    }


}
