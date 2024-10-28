public class Apr1_InterestRate {
    public static void main(String[] args) {
//        lai suat

//        Interest rate

//        200tr -> 10tr: 5%

//        Compound interest calculator
//        (lãi suất kép)

        final double annualInterestRate = 5.0; // 5% / year

//        Enter principal amount (deposit value): 100
//        Enter how many years you want to invest: 30


//        Year        Starting amount      Amount earned     Total after 1 year
//        1           100                  5                 105
//        2           105                  5.25              110.25
//        3           110.25               5.5125
//        ...
//        30          x                    x                  x


        System.out.printf("%-10s", "Year");
        System.out.printf("%-20s", "Starting amount");
        System.out.printf("%-20s", "Amount earned");
        System.out.printf("%-20s\n", "Total after 1 year");

        for (int year = 1; year <= 10; year++) {
            // 1. calculator for all the values in every row

            // 2. print the values for every row
            System.out.printf("%-10d", year);
            System.out.printf("%-10.2f", annualInterestRate);

            System.out.println();
        }
    }
}
