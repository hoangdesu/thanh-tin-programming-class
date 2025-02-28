package Challenge2.Task4;

import java.util.Set;

/**
 * Implement your Customer class here
 */

public class Customer {
//    class attributes
    private String name;
    private int customerId;
    private String email = "ERROR";
    private Privilege privilege = Privilege.GUEST;

//  2 constructors
//    #1: 4 params
    public Customer(String name, int customerId, String email, Privilege privilege) {
//        System.out.println("do Thanh tin"));
//        1. kiem tra ten co hop le hay ko truoc khi gan gia tri
        if (isValidName(name)) {
            this.name = toTitleCase(name); // automatically convert to Title Case
        } else {
            this.name = "ERROR";
        }
//        System.out.println("input = " + name + " - customer name: " + this.name);

//        2. kiem tra customerId
        if (isValidCustomerId(customerId)) {
            this.customerId = customerId;
        } else {
            this.customerId = -1;
        }

//        3. kiem tra email
        if (isValidEmail(email)) {
            this.email = email;
        }

//        4. kiem tra privilege
        if (privilege != null) {
            this.privilege = privilege;
        }
    }


//    #2: 3 params. No privilege
    public Customer(String name, int customerId, String email) {

    }

    // GETTERS / SETTERS
    public String getName() {
        return this.name;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getEmail() {
        return this.email;
    }

    // Helper / utility methods: những hàm con để phụ trợ cho việc sắp xếp code gọn gàng
    private static boolean isValidName(String name) {
//        The name must contain at least 2 characters.
        if (name.length() < 2) return false;

//        The name must NOT contain leading or trailing spaces. Leading spaces are whitespace characters before the name, trailing spaces are whitespace characters after the name.
//        vd: "     Tin Do     "
        if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
            return false;
        }

//        The name must contain only alphabetic characters and spaces, numbers are not allowed.
        for (char c : name.toCharArray()) {
            boolean isUpper = c >= 'A' && c <= 'Z';
            boolean isLower = c >= 'a' && c <= 'z';
            boolean isSpace = c == ' ';

            if (!isUpper && !isLower && !isSpace) return false;
        }

        return true;
    }

    private static String toTitleCase(String name) {
// A lowercase name can be automatically corrected to title case without reporting an error
//        input: "do thanh tin"
//        splitted words = ["do", "thanh", "tin"]
//        words[0] = "do", words[1] = "thanh", words[2] = "tin" => for loop
//        neu words[0].charAt(0) lowercase -> chuyen thanh uppercase

        String[] words = name.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
//            neu ki tu dau tien la lowercase -> chuyen thanh uppercase
            if (firstChar >= 'a' && firstChar <= 'z') {
                StringBuilder newWord = new StringBuilder(words[i]);
//                newWord = "tin"
                char upperChar = (char) (firstChar - ('a' - 'A')); // -32
                newWord.setCharAt(0, upperChar);
                words[i] = newWord.toString();
            }
        }

        return String.join(" ", words);
    }


    private static boolean isValidCustomerId(int customerId) {
//        guard clause
        if (customerId < 10000000) return false;

//        if (condition1) {
//            if (condition2) {
//                if (condition3) {
//                    if (condition4) {
//                        if (condition5) {
//                            // nested conditions
//                        } else {
//                            loi truong hop 5
//                        }
//                    } else {
//                        loi truong hop 4
//                    }
//                } else {
//                    loi truong hop 3
//                }
//            } else {
//                loi truong hop 2
//            }
//        } else {
////            loi condition
//        }

        return true;
    }

    private static boolean isValidEmail(String email) {
//        The email must contain only one @ (at) character.
        boolean hasAtSign = false;
        for (char c : email.toCharArray()) {
            if (c == '@') {
                hasAtSign = true;
                break;
            }
        }
        if (!hasAtSign) return false;

//        The email must END with .vn or .com
//        OK: thanhtin@gmail.vn, thanhtin@rmit.com, s3970879@rmit.edu.vn
        String[] emailParts = email.split("\\."); // regex: regular expression
        String lastPart = emailParts[emailParts.length - 1];
//        if (!lastPart.equals("vn") && !lastPart.equals("com")) {
//            return false;
//        }
        Set<String> validDomains = Set.of("vn", "com");
        if (!validDomains.contains(lastPart)) return false;

//        The email length must NOT exceed 125 characters.
        if (email.length() > 125) return false;

        return true;
    }
}
