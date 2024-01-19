import java.util.Scanner;

public class Jan5_StringMethods {
    public static void main(String[] args) {
        // String methods: functions dc xay dung rieng cho class String

    //  class   object
//        Scanner sc = new Scanner(System.in);

//        - class: blueprint, design of something
//        - object: instance from a class

//        OOP: Object-oriented programming: lap trinh huong doi tuong
//            - programming paradigm
//
//        Car:
//            Properties:
//                - brand name
//                - price
//                - color
//                - model
//                - doors
//            Methods:
//                - drive()
//                - reverse()
//                - honk()

        // access elements using dot notation
//        sc.nextLine();

        // string methods do NOT change its original value

        String food = "     sushi     ";
        System.out.println("I love " + food.trim());
        System.out.println(food.toUpperCase());
        System.out.println(food.toLowerCase());

        System.out.println(food.contains("ushi"));
        System.out.println(food.contains("Sus"));

//        String: array of characters
        String text = "Java is an OOP language";

        System.out.println(text.charAt(0)); // J
        System.out.println(text.charAt(11)); // O

        System.out.println(text.length());

//        for (int i = 0; i < text.length(); i++) {
//            System.out.println(text.charAt(i));
//        }

        // print reversed string
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

        System.out.println();

//        "ABC" - index: 0-2, length = 3

        System.out.println(text.equals("java is an OOP language"));

//        s1.equals(s2) => true/false

        System.out.println("index of a: " + text.indexOf('a')); // 1 -> first occurence
        System.out.println("last index of a: " + text.lastIndexOf('a')); // -> last

//        Concatenate / concatenation: ghep chuoi
//        String favFood = food.trim() + " is delicious";
        System.out.println(food.trim().concat(" is very good"));
//        System.out.println(favFood);

//        Exercise: print all index of a character in a string
//                1, 3, ..., ..., 20
//                hint: for & charAt

        String msg = "i love sushi";
        msg = msg.replace("sushi", "ramen");
        System.out.println(msg);

//        msg.split()


    }
}
