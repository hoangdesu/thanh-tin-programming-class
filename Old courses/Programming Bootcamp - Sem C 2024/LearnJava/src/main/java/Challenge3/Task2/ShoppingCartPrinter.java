package Challenge3.Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

//        int itemCounter = 1;
        ArrayList<ItemToPurchase> items = new ArrayList<>();

        for (int itemCounter = 1; itemCounter <= 2; itemCounter++) {
            System.out.println("Item " + itemCounter);
            ItemToPurchase item = new ItemToPurchase();

            System.out.println("Enter the item name:");
            String name = scnr.nextLine();
            item.setName(name);

            System.out.println("Enter the item price:");
            int price = Integer.parseInt(scnr.nextLine());
            item.setPrice(price);

            System.out.println("Enter the item quantity:");
            int quantity = Integer.parseInt(scnr.nextLine());
            item.setQuantity(quantity);

            items.add(item);

            System.out.println();
        }

        System.out.println("Created two items:");
        items.get(0).printItemPurchase();
        items.get(1).printItemPurchase();

        int totalCost = (items.get(0).getPrice() * items.get(0).getQuantity()) + (items.get(1).getPrice() * items.get(1).getQuantity());
        System.out.printf("\nTotal cost: $%d\n", totalCost);
    }
}
