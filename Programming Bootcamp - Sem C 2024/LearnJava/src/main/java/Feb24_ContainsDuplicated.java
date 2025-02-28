import java.lang.reflect.Array;
import java.util.Arrays;

public class Feb24_ContainsDuplicated {
    public static void main(String[] args) {
//        System.out.println(("DWUSXNPQKEGCZFJBTLYROHIAVM")); // true
//        System.out.println(isValidKey("FAZRDTMGQEJPWAXUSKVIYCLONH")); // false

        System.out.println(isValidKeyArray("DWUSXNPQKEGCZFJBTLYROHIAVM")); // true
        System.out.println(isValidKeyArray("FAZRDTMGQEJPWAXUSKVIYCLONH")); // false


//            key: value
//        {
//            f: 1,
//            a: 1,
//            z: 1,
//            ...,
//            p: 1,
//            a
//
//        }

//        System.out.println(Character.isAlphabetic('a'));
//        System.out.println(Character.isAlphabetic('1'));
//        System.out.println(Character.isAlphabetic('$'));
//        System.out.println(Character.isDigit('1'));
//        System.out.println(Character.is);
    }

//    public static boolean isValidKey(String key) {
//
//    }

    public static boolean isValidKeyArray(String key) {
        char[] alphabet = new char[26];

        System.out.println(alphabet[0]);

        if (alphabet[0] == '\0') {
            System.out.println("NULL 0");
        }
//        System.out.println(alphabet[0]);

//        s = "DWUSXNPQKEGCZFJBTLYROHIAVM"
//
//        'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
//         01234567890123456789
//
//
//        "FAZRDTMGQEJPWAXUSKVIYCLONH"
//
//
//         0, 1, 2, 3, 4, 5...  20 21 22
//        [A, _, _, D, _, F   U, _ W,   ]

        for (int i = 0; i < key.length(); i++) {

            // tính vị trí tương ứng của từng kí tự trong array
//         char: index
//            a: 0
//            b: 1
//            c: 2
//            ...
//            z: 25

//            lấy ascii của char hiện tại - 'a'

            char c = key.toLowerCase().charAt(i);
            int charIndex = c - 'a'; // indexOfCharInAlphabetArray - 97 (ascii of 'a')
            System.out.printf("char = %c, charIndex = %d\n", c, charIndex);


//            neu vi tri do chua co, bo char vao index do
            if (alphabet[charIndex] == '\0') {
                alphabet[charIndex] = c;
            } else {
                return false;
            }

            System.out.println("i = " + i);
            System.out.println(Arrays.toString(alphabet));

        }

        return true;
    }
}
