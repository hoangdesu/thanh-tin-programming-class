import java.util.Arrays;
import java.util.Scanner;

public class Jan26_Calculator {
    public static void main(String[] args) {
//        number types
//        double a = 1.2;
//        float b = 2.3f;
//        int c = 5;
//        long d = 8_000_000_000L;

//        unsigned vs signed

//        System.out.println(a + b + c);

        double a = 5;
        double b = 10;
//        String/char operator = '+';
//        double result = calculator(a, operator, b);
//        System.out.println(result); // 15

        // block of code

//        outside
//        {
//            inside
//        }

        // Scope of a variable: pham vi cua 1 cai bien

//        String language = "Java"; // outside
//
//         if (true) {
//             System.out.println(language); // inside
//             String name = "Tin"; // inside
//         }
//
//        System.out.println(name);

//        String name;
//        1. variable declaration: khoi tao bien
//        2. variable definition: dinh nghia cai bien

//        System.out.println(name);

//        15 2 *

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your calculation: ");
        String input = sc.nextLine();

//        System.out.println(input);
        String[] inputs = input.split("");

//        System.out.println(Arrays.toString(inputs));
        double res = calculator(Double.parseDouble(inputs[0]), inputs[1].charAt(0), Double.parseDouble(inputs[2]));
        System.out.println(inputs[0] + " " +  inputs[1] + " " + inputs[2] + " = " + res);

    }

    public static double calculator(double a, char operator, double b) {
        double result;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else {
            result = a / b;
        }

        return result;

//        tổng hiệu tích thương: addition(total) subtraction (difference) multiplication division

    }
}
