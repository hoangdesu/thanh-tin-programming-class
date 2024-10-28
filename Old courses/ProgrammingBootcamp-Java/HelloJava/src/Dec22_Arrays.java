import java.util.Arrays;

public class Dec22_Arrays {
    public static void main(String[] args) {
        // Array:
//        - data structure: cấu trúc dữ liệu

//        stack, queue, linked list, graph, array, list, hash map...

//        Array (list)
//        trong Java có 3 class riêng biệt: Arrays, List, ArrayList...

//        có thể chia làm 2 loại array: array động vs array tĩnh (dynamic vs static arrays)

//        1. elements must share the same data type
//        2. elements in the array must have their order (index)

//        String game1 = "lien quan";
//        String game2 = "lien minh";
//        String game3 = "toc chien";
//        String game4 = "pubg";

//        System.out.println(game1 + game2 + game...);

        String[] games = {"lien quan", "lien minh", "toc chien", "pubg"};

//        System.out.println(games[4]); // index out of range

//        System.out.println(games); // memory address

//        System.out.println("I play " + games[1] + " too");

//        games[3] = "valorant"; // reassign elements

//        games[0] -> games[3] => index starts from 0 -> length of the array - 1
//        System.out.println("My favorite games:");
//        for (int i = 0; i < games.length; i++) {
//            System.out.println(i+1 + ". " + games[i]);
//        }

//        macbook -> youtube server
//        server -> list of videos

//        int counter = 1;
//        for (int i = games.length - 1; i >= 0; i--) {
//            System.out.println(counter + ". " + games[i]);
//            counter++;
//        }

//        index starts from 0 => last index = array length - 1
//                games: last index = 3, length = 4

        int[] marks = {8, 7, 5, 9, 7, 4};

//        for {
//            ...
//            System.out.println(largest number is 9);
//            System.out.println(); -> smallest number is 4
//        }
//
////        trung binh = tong / array length
//
//        int total = 0;
//        for (int i = 0; i < marks.length; i++) {
//            total += marks[i]; // total = total + marks[i]
//        }
//
//        float average = (float) total / marks.length;
//        System.out.println("Average = " + average);

//        HW1:
//        array of numbers
//        find max and min of the array using for loop

//        HW2:
//        - array of food in the menu
//        - what would you like to order today? "pho"
//        - nếu có món trong menu:
//            - your pho is coming in 5 minutes
//            - sorry we dont have pho today


    }
}
