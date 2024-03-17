import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Mar17_TestSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int length = sc.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        // find min & max
        int min = numbers[0];
        int max = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        float median;
        if (numbers.length % 2 == 0) {
            float num1 = (float) (numbers[length/2-1]);
            float num2 = (float) (numbers[(length/2)]);
            System.out.printf("num1: %f - num2: %f\n", num1, num2);
            median = (num1 + num2) / 2.0f;
        } else {
            median = numbers[length/2];
        }

        System.out.println("Median: " + median);

        // find palindrome using 2 pointers
        boolean isPalindrome = true;
        for (int i = 0; i < numbers.length / 2; i++) {
            int head = numbers[i];
            int tail = numbers[length-(i+1)];

            System.out.println("head: " + head + " - tail: " + tail);
            if (head != tail) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Number array is palindrome");
        } else {
            System.out.println("Number array is NOT palindrome");
        }

//        Dung nested array de tim mode

//        array goc: [1, 2, 3, 1]
//        array moi: nested:
//
//        [[num, frequency]]
//
//        [[1, 0], [2, 0], [3, 0], [1, 0]]

//        int[][] nestedArray = new int[4][2];
//
//        System.out.println(Arrays.toString(nestedArray));


    }
}
