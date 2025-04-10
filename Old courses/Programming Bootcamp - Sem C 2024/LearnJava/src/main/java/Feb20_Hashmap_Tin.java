import java.util.HashMap;

public class Feb20_Hashmap_Tin {
    public static void main(String[] args) {
        System.out.println("Char frequency: " + getCharFrequency("abbaac"));
        System.out.println("Most appeared char: " + getMostAppearedCharacter("ccavvtcacccjckcclc"));
    }

    public static HashMap<Character, Integer> getCharFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
//            System.out.println(currentChar);

            if (!map.containsKey(currentChar)) {
                map.put(currentChar, 1);
            } else {
                int currentCount = map.get(currentChar);
                int newCurrentCount = currentCount + 1;
                map.put(currentChar, newCurrentCount);
            }

        }

        return map;
    }

    public static char getMostAppearedCharacter(String s) {
        HashMap<Character, Integer> map = getCharFrequency(s);
        char frequencyAppearChar = ' ';
        int mostFrequency = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentFrequency = map.get(currentChar);
            if (currentFrequency > mostFrequency) {
                mostFrequency = currentFrequency;
                frequencyAppearChar = currentChar;
            }
        }

//        System.out.println("frequencyAppearChar" + frequencyAppearChar);
        return frequencyAppearChar;
    }
}
