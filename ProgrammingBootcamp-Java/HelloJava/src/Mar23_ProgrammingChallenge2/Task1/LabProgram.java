package Mar23_ProgrammingChallenge2.Task1;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        // While getting user input, you might need to clear the scanner buffer
        // using nextLine(). Review Chapter 2.12 if needed.

        Scanner sc = new Scanner(System.in);

        Shop shop = new Shop();

        System.out.println("Current Stock List");
        shop.printAllItems();

        for (int i = 0; i < 2; i++) {
            System.out.printf("\nAdd %s item\n", (i == 0 ? "new" : "second"));
            System.out.print("Please enter garment name: ");
            String name = sc.nextLine();
            System.out.print("Please enter garment colour: ");
            String colour = sc.nextLine();
            System.out.print("Please enter garment size: ");
            int size = Integer.parseInt(sc.nextLine());

            Garment g = new Garment(name, colour, size);
            shop.add(g);
//            sc.nextLine();

            System.out.println("\nUpdated Stock List");
            shop.printAllItems();
        }
    }
}
