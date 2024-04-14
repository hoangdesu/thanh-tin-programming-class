import java.util.Arrays;
import java.util.Scanner;

public class Feb28_Review {
    public static void main(String[] args) {
//        Array

//        int num1 = ....
//        int num2 = ...
//        int num3 = ...
//        => NOPE
//
//        array double -> nums = {1st, 2nd, 3rd};
//
//        cho phep user nhap 3 so:
//
//        nhap so dau tien: 4
//        nhap so thu hai: 9
//        nhap so thu ba: 5.5
//
//        Total: 4 + 9 + 5.5 = ...
//        Average:

//        double[] numbers = new double[3];
        double[] numbers = {0, 0, 0};
//        double[] numbers = new double[]{1,2,3};

        // re-assign
//        numbers[1] = 6;
//
//        // access
//        System.out.println(numbers[1]);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter first number: ");
//        numbers[0] = scanner.nextDouble();
//
//        System.out.print("Enter second number: ");
//        numbers[1] = scanner.nextDouble();
//
//        System.out.print("Enter third number: ");
//        numbers[2] = scanner.nextDouble();

//        switch-case X
        String[] counter = {"first", "second", "third"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + counter[i] + " number: ");
            numbers[i] = scanner.nextDouble();
        }

//        System.out.println(Arrays.toString(numbers));

        // totalling: num0 + num1 + num2
        double total = 0;
        System.out.print("Total: ");
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];

            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(" + ");
            }
        }

        System.out.printf(" = %.2f\n", total);

        double average = total / numbers.length;
        System.out.printf("Average: %.3f", average);
    }
}

//array: data type giong nhau
//[1, "Tin", true, 3.14]