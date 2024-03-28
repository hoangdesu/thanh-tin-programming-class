import java.util.ArrayList;
import java.util.Arrays;

public class Mar27_getWordFreqSol {
        public static void main(String[] args) {
            ArrayList<String[]> wordsFrequency = getWordsFrequency("hey Hi Mark hi mark");

            for (String[] pair : wordsFrequency) {
                System.out.println(Arrays.toString(pair));
            }

//        case insensitive
//
//        System.out.println(wordsFrequency);
//        -> {"word": frequency (int)}
//
//        [{"hey", "1"}, {"hi", "2"}, {"mark", "2"}];
        }

        public static ArrayList<String[]> getWordsFrequency(String s) {

            // split the string into an array of strings, using whitespace
            String[] words = s.split(" ");
            System.out.println(Arrays.toString(words));

            // create an empty array list
            // to build and return later
            ArrayList<String[]> wordFrequency = new ArrayList<>();

            // traditional for loop
//            for (int i = 0; i < words.length; i++)

            //            try-catch: avoid error
//            try {
//                System.out.println(Arrays.toString(wordFrequency.get(10)));
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("ERRORRRRRRR");
//            }
//            System.out.println(Arrays.toString(wordFrequency.get(10))); // ERROR

//            System.out.println(wordFrequency.contains(new String[]{"A", "1"})); // true -> false

//            if (wordFrequency.isEmpty()) {
//                wordFrequency.add(new String[]{words[0], "1"});
//            }

            for (String word : words) {
                wordFrequency.add(new String[]{word, "1"});
            }

            for (int i = 0; i < wordFrequency.size(); i++) {
                for (int j = 0; j < wordFrequency.size(); j++) {
                    System.out.printf("- i = %d, word = %s \n", i, wordFrequency.get(i)[0]);
                }
            }

            // enhanced for loop
//            for (String word : words) {
//                // kiem tra xem word co trong wordFrequency hay chua
//                // neu chua, tao 1 String[] voi dinh dang {word: "1"}
//                // khoi tao frequency bang 1 (STRING)
//
////                wordFrequency.add(new String[]{word, "1"});
//
////                for (int i = 0; i < wordFrequency.size(); i++) {
////                    try {
////                        // co element
////                        wordFrequency.get(i); // -> luon luon co loi
////                        System.out.println("Getting word frequency index: " + i);
////                    } catch (IndexOutOfBoundsException e) {
////                        // ko co element
////                        String[] pair = new String[]{word, "1"};
////                        System.out.println("Pair: " + Arrays.toString(pair));
////                        wordFrequency.add(pair);
////                    }
////                }
//
//
//
//            }



            return wordFrequency;
        }

}



//    ArrayList<String> -> ["Tin", "Nhu Y", "Hoang"]
//    ArrayList<String[]> -> [{"Tin", 1}]
//
//    Array dong + Array tinh


