import java.util.HashMap;

public class Apr21_String {
    public static void main(String[] args) {
        System.out.println(charFrequency("abca"));

//        {
//            a: 2,
//            b: 1,
//            c: 1,
//        }
    }

//    String
    static HashMap<Character, Integer> charFrequency(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();

//        {
//            a: 2,
//            b: 1,
//            c: 1,
//        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!frequency.containsKey(c)) {
                frequency.put(c, 1);
            } else {
                int currentCount = frequency.get(c);
                int newCount = currentCount + 1;
                frequency.put(c, newCount);
            }
        }

        return frequency;
    }
}
