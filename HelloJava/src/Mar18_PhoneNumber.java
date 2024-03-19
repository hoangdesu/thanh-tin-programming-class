public class Mar18_PhoneNumber {
    public static void main(String[] args) {
        String number = convertWordToNumber(1800, "APPLE");
        System.out.println("Converted phone number: " + number); // -> 1800-27753
    }


    public static String convertWordToNumber(int prefix, String word) { //-> String e.g. prefix-word
        StringBuilder phone = new StringBuilder();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
//            if word.charAt(i) == a or word.charAt(i) == b or word.charAt(i) == c => "2"

            switch (word.charAt(i)) {
                case 'a', 'b', 'c':
                    phone.append("2");
                    break;
                case 'd', 'e', 'f':
                    phone.append("3");
                    break;
                case 'g', 'h', 'i':
                    phone.append("4");
                    break;
                case 'j', 'k', 'l':
                    phone.append(5);
                    break;
                // ... 6
                case 'p', 'q', 'r', 's':
                    phone.append(7);
                    break;
                // 8
                // 9

            }
        }
        return String.format("%d-%s", prefix, phone);
    }
}

//ki thuat mapping: connect 1 gia tri tuong duong voi 1 hoac nhieu gia tri khac

//COUNTRY - CAPITAL
//vietnam - hanoi
//japan - tokyo
//korea - seoul
//france - paris

//CHARACTERS - NUMBER
//A-B-C => 2
//D-E-F => 3
//...

//import java.util.Scanner;
//
//public class march18_phoneNumbers {
//    public static void main(String[] args) {
//
//        String phoneNumber = convertWordToNumbers( 1800,"apple");
//        System.out.println("convert to phone numbers"+phoneNumber);
//    }
//
//    public static String convertWordToNumbers(int prefix, String word) {
//        StringBuilder phone = new StringBuilder();
//        word=word.toLowerCase();
//        for (int i = 0; i < word.length() ; i++) {
//            switch (word.charAt(i)) {
//                case 'a','b','c':
//                    phone.append(2);
//                    break;
//                case 'd','e','f':
//                    phone.append(3);
//                    break;
//                case 'g','h','i':
//                    phone.append(4);
//                    break;
//                case 'j','k','l':
//                    phone.append(5);
//                    break;
//                case 'm','n','o':
//                    phone.append(6);
//                    break;
//                case 'p','q','r','s':
//                    phone.append(7);
//                    break;
//                case 't','u','v':
//                    phone.append(8);
//                    break;
//                case 'w','x','y','z':
//                    phone.append(9);
//                    break;
//
//
//            }
//        }
//
//        prefix + "-" + phone => String.format("%d-%s", prefix, phone);
//        return phone.toString();
//
//    }
//
//}