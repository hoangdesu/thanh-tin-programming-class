import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mar14_Review {
    public static void main(String[] args) {
//        ArrayList drinks = ["coffee", "tea", "water"];
//
//        ArrayList<> shuffledDrinks = shuffle(drinks);
//        System.out.println(shuffledDrinks); => ["tea", "coffee", "water"];
//
//        shuffledDrinks = shuffle(drinks);
//        System.out.println(shuffledDrinks); => ["water", "tea", "coffee"];

        // ki thuat swap value
//        int a = 5;
//        int b = 10;
//
//        /// swap using a "temporary variable"
//        int temp = a; // temp = 5
//        a = b; // a = 10
//        b = temp; // b = a = 10
//
//        System.out.println("a = " + a); // 10
//        System.out.println("b = " + b); // 5

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("coffee", "tea", "juice"));
        drinks.add("water");

        System.out.println("Drinks: " + drinks);

        ArrayList<String> shuffledDrinks = shuffle(drinks);
        System.out.println("Shuffled drinks: " + shuffledDrinks); // array moi

    }

//    shuffle(ArrayList<String>) -> shuffled ArrayList<String>

    public static ArrayList<String> shuffle(ArrayList<String> list) {
        ArrayList<String> shuffledList = new ArrayList<>(list); // copy array list

        for (int i = 0; i < shuffledList.size(); i++) {
//            swap current index with random index
            String currentItem = shuffledList.get(i);
            int randomIndex = (int) (Math.random() * shuffledList.size());
            String randomItem = shuffledList.get(randomIndex);
            shuffledList.set(i, randomItem);
            shuffledList.set(randomIndex, currentItem);

            System.out.println("- current index: " + i);
            System.out.println("- currentItem: " + currentItem);
            System.out.println("- randomIndex: " + randomIndex);
            System.out.println("- randomItem: " + randomItem);
            System.out.println("- current list after swapping: " + shuffledList);
            System.out.println();
        }
        return shuffledList;
    }




//    gia tri tra ve cua ham nay la 1 ArrayList of String
}
