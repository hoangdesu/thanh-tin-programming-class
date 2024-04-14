import java.util.Scanner;

public class Mar11_FoodCharity {
    public static void main(String[] args) {
        exercise();
    }

    public static void exercise() {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Number of people:");
        int numOfPeople = sc.nextInt();

        System.out.println("Number of meals per person:");
        int NumberOfMealsPerPerson = sc.nextInt();

        System.out.println("Cost per bag of rice:");
        double costPerBag = sc.nextDouble();

        // Calculate total meals and bags of rice required
        int totalMeals = numOfPeople *  NumberOfMealsPerPerson;
        int bagsOfRice = (int) Math.ceil((double) totalMeals / 12);

        // Calculate total cost
        double totalCost = bagsOfRice * costPerBag;
        double totalCostWithoutLate = bagsOfRice * costPerBag;

        // Output summary report
        System.out.println("\nThis order will support " + numOfPeople + " people to each make " +  NumberOfMealsPerPerson + " rice based meals.");
        System.out.println("Total meals: " + totalMeals);
        System.out.print("You will need " + bagsOfRice + " bags of rice for a cost of $" + String.format("%.2f", totalCost)+ ".");

        System.out.println("\nPlease input the expected percentage of late orders:");
        double lateOrderPercentage = sc.nextDouble();

        // Calculate additional bags of rice and cost for late orders
        int additionalBagsOfRice = (int) Math.ceil((numOfPeople * lateOrderPercentage / 100 * NumberOfMealsPerPerson) / 12);
        double additionalCostForLate = additionalBagsOfRice * costPerBag;


        totalMeals = numOfPeople *  NumberOfMealsPerPerson;
        System.out.println(additionalBagsOfRice);

        // Output summary report with late orders
        System.out.println("\nAllowing for late orders, you should order: " + (bagsOfRice + additionalBagsOfRice) + " bags of rice for a cost of $" + String.format("%.2f", totalCostWithoutLate + additionalCostForLate));

    }
}





