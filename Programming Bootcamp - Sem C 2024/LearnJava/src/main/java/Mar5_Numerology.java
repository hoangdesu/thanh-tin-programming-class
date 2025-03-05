import java.lang.reflect.Array;
import java.util.Arrays;

public class Mar5_Numerology {
    public static void main(String[] args) {
//        numerology("01/11/2024"); // 0+1+1+1+2+0+0+4 = 9
//        numerology("26-02-1995"); // 2+6+2+1+9+9+5 = 34 => 3+4 = 7
//
//        numerology("1995.02.26"); // 2+6+2+1+9+9+5 = 34 => 3+4 = 7

        String num1 = "1";

        char c1 = num1.charAt(0);

        if (c1 >= '0' && c1 <= '9') {
            System.out.println("c1 is a digit");
            int valueOfC1 = c1 - '0'; // '0': 47,' 1': 48
            System.out.println(c1 + 3); // sai -> ASCII
            System.out.println(valueOfC1 + 3); // -> gia tri int cua digit do
        }

        int num = 34;

//        34 / 10 => 3
        System.out.println("first: " + num / 10); // first digit
        System.out.println("second: " + num % 10); // second digit


        String numStr = String.valueOf(num);
        System.out.println(numStr.charAt(0)); // '3'
        System.out.println(numStr.charAt(1)); // '4'

//        34 / 10 = 3.4
//        34 % 10 = 3 dư 4
//        134 / 10 = 13

//        selectionSort
        int[] nums = {3, 1, 4, 2, 5, 7, 8, 6};
        int[] sortedNums = selectionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sortedNums));


    }

//    public static int numerology(String dob) {
//
//    }

    public static int[] selectionSort(int[] arr) {
//       min
//        i  j
//        3, 1, 4, 2, 5, 7, 8, 6

        int[] sortedArr = new int[arr.length];

        System.arraycopy(arr, 0, sortedArr, 0, arr.length);

        System.out.println("Copied: " + Arrays.toString(sortedArr));

        for (int i = 0; i < sortedArr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < sortedArr.length; j++) {
                if (sortedArr[j] < sortedArr[minIndex]) {
                    minIndex = j;
                }
            }

//            Swap values between i and j
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[minIndex];
            sortedArr[minIndex] = temp;
        }

        return sortedArr;
    }
}
