package Challenge2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int nums[];
        int count;
        // Declare additional variables (if any) here

        // Step 0: Input array values
        count = scnr.nextInt();
        nums = new int[count];
        for (int i = 0; i < count; ++i) {
            nums[i] = scnr.nextInt();
        }


        // Step 1: Find and output minimum and maximum values
        /* Type your code here */
        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            } else if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }
        System.out.println("Minimum: " + minNum);
        System.out.println("Maximum: " + maxNum);

        // Step 2: Calculate and output mean
        /* Type your code here */
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
//             sum += nums[i] ;
            sum = sum + nums[i];
        }
        double average = sum / count;

        System.out.printf("Mean: %.1f%n", average);


        // Step 3: Check if palindrome
        /* Type your code here */
//        boolean isPalindrome = false;
//        for (int i = 0; i < nums.length -1; i++) {
//            if (nums[i] == nums[i] - 1) {
//                isPalindrome = true;
//                break;
//            }
//        }

        System.out.println("Palindrome: " + isPalindrome(nums));


        // Sort array elements in ascending order
        Arrays.sort(nums);

        // Step 4: Find and output median
        /* Type your code here */
        double median = 0;

        if (count % 2 == 1) {
            median = nums[count / 2];
        } else {
            median = (nums[count / 2] + nums[count / 2 - 1]) / 2.0;
        }

        System.out.println("Median: "+median);
        // Step 5: Find and output mode
        /* Type your code here */

        System.out.println("Mode: " + getMode(nums));

    }

    private static boolean isPalindrome(int[] nums) {
        int headPointer = 0;
        int tailPointer = nums.length - 1;

        while (headPointer <= tailPointer) {
            int headNum = nums[headPointer];
            int tailNum = nums[tailPointer];

//            chỉ cần 1 cặp ko bằng nhau, kết luận luôn array đó ko phải là palindrome
            if (headNum != tailNum) return false;

//            còn nếu 2 số bằng nhau, dịch chuyển 2 pointers
            headPointer++;
            tailPointer--;
        }

        return true;
    }

    private static int getMode(int[] nums) {
//
//        Step 1: build hashmap =>

//           (num) keys:values (count)
//        {
//                    1: 1,
//                    2: 3,
//                    3: 2,
//                    4: 1,
//                    5: 1,
//                    6: 1
//        }


        HashMap<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int num : nums) {
//            neu chua co entry, minh tao entry voi key:1
            if (numberFrequencyMap.get(num) == null) {
                numberFrequencyMap.put(num, 1);
            } else {
//                neu trong hashmap co so nay roi, minh se cong count len 1
                int currentCount = numberFrequencyMap.get(num);
                int newCount = currentCount + 1;
                numberFrequencyMap.put(num, newCount);
            }
        }

//        System.out.println(numberFrequencyMap);

//        STEP 2: compare all the values, return the key with the max value
        int maxKey = 0;
        int maxValue = 0;
        for (int key : numberFrequencyMap.keySet()) {
            int value = numberFrequencyMap.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

//        System.out.println("maxKey: " + maxKey);
//        System.out.println("maxValue: " + maxValue);

        return maxKey;
    }
}

