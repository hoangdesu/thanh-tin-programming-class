public class Feb27_Challenge2Task4_CheckName {
    public static void main(String[] args) {
        System.out.println(isValidName("Andy Thompson")); // true
        System.out.println(isValidName("sophia martinez")); // false
        System.out.println(isValidName("Lily Ada2ms")); // false
        System.out.println(isValidName("a")); // false
        System.out.println(isValidName(" Andy Thompson")); // false
    }

    public static boolean isValidName(String name) {
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

//        The name must be in title case. E.g., Andy Thompson, Tran Ngoc Hoa
        String[] words = name.split(" ");
        for (String word : words) {
            char firstChar = word.charAt(0);
            if (!(firstChar >= 'A' && firstChar <= 'Z')) return false;
        }

        return true;
    }
}
