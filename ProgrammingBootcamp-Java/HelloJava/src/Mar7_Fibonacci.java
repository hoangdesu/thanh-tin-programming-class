import java.util.ArrayList;
import java.util.Scanner;

public class Mar7_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers in the Fibonacci sequence do you want to generate: ");
        int totalNumber = sc.nextInt();

        ArrayList<Long> fibSequence = getFibonacciArray(totalNumber);
//        System.out.println(fibSequence);

        System.out.println("n-th number\t\tfib number");
        for (int i = 0; i < fibSequence.size(); i++) {
            System.out.printf("%d\t\t\t\t%d\n", (i+1), fibSequence.get(i));
        }
    }

    public static ArrayList<Long> getFibonacciArray(int total) {
        ArrayList<Long> fibonacciSequence = new ArrayList<>();

        fibonacciSequence.add(0L); // i = 0
        fibonacciSequence.add(1L); // i = 0

        long num1 = 0;
        long num2 = 1;

        // loop
        for (int i = 0; i < total-2; i++) {
            long nextNum = num1 + num2;
            fibonacciSequence.add(nextNum);

            // swap
            num1 = num2;
            num2 = nextNum;
        }

        return fibonacciSequence;
    }

}



//so sau = tong cua 2 so dung truoc no
//
//
//n-th:   1 2 3 4 5 6 7  8  9 10 ...
//number: 0 1 1 2 3 5 8 13 21 34 ...
//
//
//=> viet 1 method de return 1 arraylist bao gom tong so phan tu
//
//getFibonacciArray(int elements) => int [...]
//
//getFibonacciArray(8) => [0, 1, 1, 2, 3, 5, 8, 13]
//getFibonacciArray(5) => [0, 1, 1, 2, 3]


//n-th    fib number
//1       0
//2       1
//3       1
//4       2
//5       3
//6       5

//9223372036854775807
//7540113804746346429