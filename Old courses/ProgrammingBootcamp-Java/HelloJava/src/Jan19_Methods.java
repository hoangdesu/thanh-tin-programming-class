import java.util.Arrays;

public class Jan19_Methods {
    public static void main(String[] args) {
        String[] foodMenu = getFoodMenu();
//        System.out.println(foodMenu); // memory address
        System.out.println("Here is what we have on the menu:");
//        System.out.println(Arrays.toString(foodMenu));
        for (int i = 0; i < foodMenu.length; i++) {
            System.out.println("- " + foodMenu[i]);
        }

        System.out.println("What would you like to order: ");
//        ...

////        input: enter a food to order: pizza
//        -> your pizza will be coming in 5 minutes
//
//        input: ramen
//        -> sorry we dont have ramen
//        Please order another food on the menu: burger
//        ^ lap lai cau nay neu user bi khung va enter sai
    }

    public static String[] getFoodMenu() {
        String[] menu = {"pizza", "burger", "beefsteak", "spaghetti"};
        return menu;
    }

//    Menu:
//    - pho
//    - com tam
//    - hu tiu

//    chi co the return 1 value
}