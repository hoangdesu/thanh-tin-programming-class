public class Dec16_Strings {
    public static void main(String[] args) {
        String randomPassword = generateRandomPassword(20);
        System.out.println("New random password: " + randomPassword);


//        removeIndexFromString("Java", 2); => "Jaa"; -> index dung
//        removeIndexFromString("Tin", 5); => "Tin"; -> sai index
    }

    public static String generateRandomPassword(int passwordLength) {
//        Bước 1: random 1 con số trong 1-3 cho 3 options
//            1: Uppercase
//            2: Lowercase
//            3: Number
        StringBuilder sb = new StringBuilder();

        for (int __ = 0; __ < passwordLength; __++) {
            int type = (int) Math.floor(Math.random() * 3) + 1; // 1-3
//            System.out.println(type);

//        if (type == 1) {
//            System.out.println("Upper");
//        } else if (type == 2) {
//
//        }

//      if type == 1
            switch (type) {
                case 1:
//                    System.out.println("Upper");
                    int upperAscii = 65 + (int) Math.floor(Math.random() * (90 - 65 + 1)); // 65-90
//                    System.out.println((char) upperAscii);
                    sb.append((char) upperAscii);
                    break;
                case 2:
//                    System.out.println("Lower");
                    int lowerAscii = 97 + (int) Math.floor(Math.random() * (122 - 97 + 1)); // 97-122
//                    System.out.println((char) lowerAscii);
                    sb.append((char) lowerAscii);
                    break;
                case 3:
//                    System.out.println("Number");
                    int number = (int) Math.floor(Math.random() * 10); // 0-9
//                    System.out.println(number);
                    sb.append(number);
                    break;
            }
        }

//        System.out.println("String builder: " + sb.toString());

        return sb.toString();
    }

    public static String removeIndexFromString(String text, int removeIndex) {
        return "";
    }
}

//random.randint(65, 90)

//    Math.floor(Math.random()) * 90 => 0 - 89
//    65 + Math.floor(Math.random()) * 90 => 65 - 154
//    65 + Math.floor(Math.random()) * 90 - (65 + 1) => 65 - 90


// để random 1 số trong khoảng từ a -> b
// a + Math.floor(Math.random() * (b+1 - a))

