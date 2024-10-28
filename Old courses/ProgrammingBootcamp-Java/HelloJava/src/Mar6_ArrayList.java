import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Mar6_ArrayList {
    public static void main(String[] args) {
//        ArrayList<String> games = new ArrayList<>();
//
//        String[] gamesStaticArray = new String[10];


//        System.out.println(games);
//
//        System.out.println(Arrays.toString(gamesStaticArray));


//        int a = 3; // primitive
//        Integer b = 5; // Wrapper
//
//        System.out.println(a + b);

        ArrayList<Double> marks = new ArrayList<>();

//        int[] nums = new int[];
//        Scanner sc = new Scanner(System.in);

//        class ben trai va ben phai co the khac nhau
//        List<Integer> nums = new ArrayList<>();
//        System.out.println(nums);

        // add new elements
        marks.add(6.9);
        marks.add(9.1); // i = 1
        marks.add(1.2);
        marks.add(9.9);

//        reassign values
//        marks[index] -> marks.set(index, new_value);
        marks.set(2, 5.6); // 1.2 -> 5.6

        System.out.println(marks.get(1)); // 9.1

//          static   ->  dynamic
// length:  .length  ->  .size()
// access:  array[i] ->  array.get(i)

//        tinh average
//        for (double mark : marks) {
//
//        }

        double total = 0;
        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }

        double avg = total / marks.size();
        System.out.printf("Average marks: %.2f", avg);
    }
}

// fact: ArrayList động đơn thuần được xây dựng dựa trên Array tĩnh
//- type of ArrayList MUST be a Wrapper Type (not primitive)

//primitive vs Wrapper:
//- int
//- Integer

//ArrayList<WrapperTyPE>