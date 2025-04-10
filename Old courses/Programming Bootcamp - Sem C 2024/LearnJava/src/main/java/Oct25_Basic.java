public class Oct25_Basic {
    public static void main(String[] args) {
//        Primitive types: int, long, char, boolean, float, double, byte...
//        Wrapper types: String, Scanner,...

        int a = 1;
        Integer b = 2;

        System.out.println(b.getClass());

        System.out.println(a + b);

        String name = "Tin";

        System.out.println(name.toUpperCase());

//        ASCII

        char a_char = 'a'; // 97

        System.out.println(a_char);
        System.out.println(a_char + 1);
        System.out.println((char) (a_char - 32));


        String upperName = toUpperCase("thiEn aN!!! 766w8dsidAKJHK");
        System.out.println(upperName); // THIEN AN

//        name.

    }

    public static String toUpperCase(String text) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char char_c = text.charAt(i);
            int decimal_c = (int) char_c;

            int upper_decimal_c = decimal_c;

//            if lowercase, convert to uppercase
            if (decimal_c >= 97 && decimal_c <= 122) {
                upper_decimal_c = decimal_c - 32; // 32 = difference between upper & lower cases
            }

            char upper_char_c = (char) upper_decimal_c;
            output.append(upper_char_c);
        }

        return output.toString();
    }
}

