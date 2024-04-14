package Apr4_Challenge1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        int principle = sc.nextInt();
//        printf "%.2f"

//        ^2: 3^2 = 9
//        ^3: 3^3 = 27
//        ^
//        int principle = 172_000;

//        format a double with comma-separated, 2 decimal places
//        System.out.printf("$%,.2f%n", (double) principle);

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the principle amount:");
        int principle = sc.nextInt();
        System.out.println("Please enter the interest rate:");
        double interestRate = sc.nextDouble();
        System.out.println("Please enter the frequency of interest:");
        int frequencyOfInterest = sc.nextInt();
        System.out.println("Please enter the time period of the investment:");
        int timeForInvestment = sc.nextInt();

        System.out.println();

        System.out.printf("You entered a principle amount of $%,.2f.%n", (double) principle);
        System.out.printf("Rate of interest is %.2f percent.%n", interestRate);
        System.out.printf("Increase occurs %d times per year for a period of %d years.", frequencyOfInterest, timeForInvestment);

        // principle*(1+(interest rate / 100))^ (frequency * time invested) – principle
        double principleDouble = (double) principle;
        double base = 1f + (interestRate / 100f);
        double power = frequencyOfInterest * timeForInvestment;
        double compoundInterest = principleDouble * Math.pow(base, power) - principleDouble;

//        System.out.println();
//        System.out.println("base: " + base);
//        System.out.println("power: " + power);
//        System.out.println("Compound interest: " + compoundInterest);

        System.out.printf("\nThe total interest payable at the end of %d years is: $%,.2f.%n", timeForInvestment, compoundInterest); // 29,215.67

        double totalValue = compoundInterest + principleDouble;
        System.out.printf("The total value of the investment after %d years is: $%,.2f.\n", timeForInvestment, totalValue); // 201,215.67

//        HW: Challenge 1, Task 1
    }
}
