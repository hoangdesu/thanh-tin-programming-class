//package Apr4_Challenge1;
//
//public class Task1_Tin {
//}


//import java.util.Scanner;
//
//public class LabProgram {
//    public static void main(String[] args) {
//        //principle, interest rate, frequency of interest, and period of time for the investment.
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter the principle amount:");
//        int principle = sc.nextInt();
//        System.out.println("Please enter the interest rate:");
//        float interestRate = sc.nextFloat();
//        System.out.println("Please enter the frequency of interest:");
//        int frequencyOfInterest = sc.nextInt();
//        System.out.println("Please enter the time period of the investment:\n");
//        int timeForInvestment = sc.nextInt();
//
//        System.out.println("You entered a principle amount of $" + principle + ".");
//        System.out.println("Rate of interest is " + interestRate + " percent.");
//        System.out.print("Increase occurs " + frequencyOfInterest + " times per year for a period of " + timeForInvestment + " years.\n");
//
//        float totalInvest = (float) (principle * Math.pow(1 + (interestRate ), (frequencyOfInterest * timeForInvestment)) - principle);
//        float totalValue = principle + totalInvest;
//
//        System.out.println("The total interest payable at the end of " + timeForInvestment + " years is: $" + totalInvest+".");
//        System.out.println("The total value of the investment after " + timeForInvestment + " years is: $" + totalValue+".");
//
//
//    }
//}
