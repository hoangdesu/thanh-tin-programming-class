import java.util.Arrays;

public class Jan13_Algorithms {
    public static void main(String[] args) {
        int[] numbers = {2,5,8,12,16,23,38,56,72,91};
//        System.out.println(Arrays.toString(numbers));

        int searchValue = 23;
        int foundIndex = binarySearch(numbers, searchValue);
//        System.out.printf("Index of %d is %d%n", searchValue, foundIndex);

//        HW
        int[] numbers2 = new int[10];
        System.out.println(Arrays.toString(numbers2));

        int i = 0;
        while (i < numbers2.length) {
            int randNum = (int) (Math.random() * 99 + 1);
            numbers2[i] = randNum;
            i++;
        }

        System.out.println(Arrays.toString(numbers2));
        int maxNum = findMax(numbers2);

        System.out.println(maxNum);
    }

    public static int binarySearch(int[] nums, int searchValue) {
        int leftPtr = 0;
        int rightPtr = nums.length - 1;
//        int midPtr = (leftPtr + rightPtr) / 2;
//
//        System.out.println(midPtr);
//        System.out.println(nums[midPtr]);
//        System.out.println(searchValue);

//        int midValue = nums[midPtr];
//        if (searchValue > midValue) {
//            System.out.println("Bỏ bên trái, qua bên phải");
//        } else if (searchValue < midValue) {
//            System.out.println("Bỏ bên phải, qua bên trái");
//        } else {
//            System.out.println("Đúng giá trị cần tìm rồi. Finish tại đây");
//        }

        while (leftPtr < rightPtr) {
            int midPtr = (leftPtr + rightPtr) / 2;
            int midValue = nums[midPtr];

            if (searchValue < midValue) {
//                Bỏ bên phải, qua bên trái
                rightPtr = midPtr - 1;
            } else if (searchValue > midValue) {
//                Bỏ bên trái, qua bên phải
                leftPtr = midPtr + 1;
            } else {
                return midPtr;
            }

        }

        return -1;
    }

    public static int findMax(int[] nums) {
        return 0;
    }

    public static int findMin(int[] nums) {
        return 0;
    }
}
