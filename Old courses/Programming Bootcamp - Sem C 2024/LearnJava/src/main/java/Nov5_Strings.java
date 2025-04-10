public class Nov5_Strings {
    public static void main(String[] args) {
//        System.out.println("tin".equals("tin")); // true
//        System.out.println("tin".equals("TiN")); // false

//        boolean ?? = isSimilar("tiN", "Tin"); -> true
//        isSimilar("tin", "hoang"); -> false

//        boolean result1 = isSimilar("tiN", "Tin");
//        System.out.println("tiN vs Tin: " + result1);
//
//        System.out.println("tIn vs Tim: " + isSimilar("tIn", "Tim"));

        System.out.println(isPalindrome("tin")); // false
        System.out.println(isPalindrome("radar")); // true

//        String name = "tin do";

//        System.out.println(name.charAt(name.length() - 1));
    }

    public static boolean isSimilar(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

//        index: 0 1 2
//        s1:    t i N => tin
//        s2:    T i n => tin

//        1. quy tat ca chu cai ve lower case
//        String lowerS1 = s1.toLowerCase();
//        String lowerS2 = s2.toLowerCase();

//        2. kiem tra cac cap trong tung string xem co bang nhau ko
//        return lowerS1.equals(lowerS2);

        int distance = 32; // distance from upper to lowercase

        for (int i = 0; i < s1.length(); i++) {
//            1. quy tat ca chu cai ve lower case
            int c1 = (int) s1.charAt(i);
            if (c1 >= 65 && c1 <= 90) c1 += distance;

            int c2 = (int) s2.charAt(i);
            if (c2 >= 65 && c2 <= 90) c2 += distance;

//            2. kiem tra cac cap trong tung string xem co bang nhau ko
            if (c1 != c2) return false;
        }

        return true;
    }

    public static boolean isPalindrome(String s) {
        int tailIndex = s.length() - 1;

        for (int headIndex = 0; headIndex < s.length() / 2; headIndex++) {
            char headChar = s.charAt(headIndex);
            char tailChar = s.charAt(tailIndex);

            if (headChar != tailChar) return false;
            tailIndex--;
        }

        return true;
    }


}
