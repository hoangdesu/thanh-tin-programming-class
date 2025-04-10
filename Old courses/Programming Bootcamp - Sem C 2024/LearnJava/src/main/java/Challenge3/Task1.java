package Challenge3;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static int[] removeOdds(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
//                System.out.println(num);
            }
        }

        int[] evens = new int[evenList.size()];

        for (int i = 0; i < evenList.size(); i++) {
            evens[i] = evenList.get(i);
        }

        return evens;
    }

    public static void main(String[] args) {
        // Example 1
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result1 = removeOdds(array1);
        System.out.println(Arrays.toString(result1)); // Output: [2, 4, 6, 8]

        // Example 2
        int[] array2 = {2, 8, 6};
        int[] result2 = removeOdds(array2);
        System.out.println(Arrays.toString(result2)); // Output: [2, 8, 6]
    }
}
