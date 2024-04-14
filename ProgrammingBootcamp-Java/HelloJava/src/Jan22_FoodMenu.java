import java.util.Arrays;
import java.util.Scanner;

public class Jan22_FoodMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] foodMenu = getFoodMenu();

        System.out.println("Here is what we have on the menu:");
        for (int i = 0; i < foodMenu.length; i++) {
            System.out.println("\t" + (i+1) + ". " + foodMenu[i]);
        }

        System.out.print("\nWhat would you like to order: ");

        String order = scanner.nextLine();

        // di tim order co trong array foodMenu hay ko

        // cach 0: ko su dung method
//        boolean exist = false;
//
//        for (int i = 0; i < foodMenu.length; i++) {
//            if (foodMenu[i].equals(order)) {
//                exist = true;
//                break;
//            }
//        }
//
//        if (exist) {
//            System.out.println("your " + order + " will be coming in 5 minutes");
//        } else {
//            System.out.println("sorry we dont have " + order);
//        }

        // cach 2:
//        findFoodAndDisplayResult(foodMenu, order);

        // cach 1:
        boolean exist = findFoodExist(foodMenu, order);
        if (exist) {
            System.out.println("your " + order + " will be coming in 5 minutes");
        } else {
            System.out.println("sorry we dont have " + order);
        }
    }

    public static String[] getFoodMenu() {
        String[] menu = {"pizza", "burger", "beefsteak", "spaghetti"};
        return menu;
    }

    public static void findFoodAndDisplayResult(String[] foodMenu, String order) {
        boolean exist = false;

        for (int i = 0; i < foodMenu.length; i++) {
            if (foodMenu[i].equals(order)) {
                exist = true;
                break;
            }
        }

        if (exist) {
            System.out.println("your " + order + " will be coming in 5 minutes");
        } else {
            System.out.println("sorry we dont have " + order);
        }
    }

    public static boolean findFoodExist(String[] foodMenu, String order) {
        boolean exist = false;

        for (int i = 0; i < foodMenu.length; i++) {
            if (foodMenu[i].equals(order)) {
                exist = true;
                break;
            }
        }

        return exist;
    }

//    Menu:
//    - pho
//    - com tam
//    - hu tiu

//    chi co the return 1 value
}
//        ...

////        input: enter a food to order: pizza
//        -> your pizza will be coming in 5 minutes
//
//        input: ramen
//        -> sorry we dont have ramen
//        Please order another food on the menu: burger
//        ^ lap lai cau nay neu user bi khung va enter sai

// Linear search
