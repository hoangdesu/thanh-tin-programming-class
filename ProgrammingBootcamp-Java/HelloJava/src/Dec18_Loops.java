import java.util.Scanner;

public class Dec18_Loops {
    public static void main(String[] args) {
//        Iteration / Loops
//        2 types:
//            1. loop within a known range: for, foreach

        //        start; stop (condition); step
//        for (int i = 0; i < 10; i++) {                // for loop statement
//            System.out.println(i + ". Wassup");       // body statement
//        }

//        for (int x = 5; x < 20; x += 2) {
//            System.out.println(x + ". Hi");
//        }

//        for (int z = 10; z >= 0; z -= 2) {
//            System.out.println(z);
//        }

//        loop forever
//        for (;;) {
//            System.out.println("Hi");
//        }

//        1-20: 2 4 6 8 10...20
//        for (int i = 1; i <= 20; i++) {
////            Remainder: chia lấy phần dư % => modulus, i mod 2
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        số nguyên tố - prime number
//        chỉ chia hết cho 1 và chính nó
//
//      0-20: 2 3 5 7 11 13 17 19
//        for (int num = 2; num <= 20; num++) {
////            if num > 2...
//            boolean isPrime = true; // flag
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(num + " ");
//            }
//        }

//        HW: print all prime numbers within a range

        // clock
//        for (int minuteHand = 0; minuteHand < 60; minuteHand++) {
//            for (int secondHand = 0; secondHand < 60; secondHand++) {
//                System.out.println(minuteHand + ":" + secondHand);
//            }
//        }


//            2. range is unknown, break using a condition: while, do-while
//                - break condition must be updated manually
//        int a = 1;
//
//        while (a < 10) {
//            System.out.println(a);
//            a++; // a = a + 1;
//        }
//
//        System.out.println("outside: " + a); // 10

        // using with user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("This is a city in Japan.");
            String answer = "tokyo";

            System.out.print("Guess the correct city: ");
            String guess = scanner.nextLine();

            if (guess.equals(answer)) {
                System.out.println("Correct. Congratulations!!");
                break;
            } else {
                System.out.println("Sorry that's a wrong answer :(");
            }
        }


//        HW: print Fibonacci sequence using both for and while loops

//        0 1 1 2 3 5 8 13 21 34 ...
//
//        How many numbers in the Fibonacci sequence: 7
//        -> 0 1 1 2 3 5 8


    }
}
