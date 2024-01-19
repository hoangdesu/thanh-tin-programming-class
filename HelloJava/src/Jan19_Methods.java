import java.util.Arrays;

public class Jan19_Methods {
    public static void main(String[] args) {
        String[] foodMenu = getFoodMenu();
        System.out.println(foodMenu); // memory address
        System.out.println(Arrays.toString(foodMenu));

    }

    public static String[] getFoodMenu() {
        String[] menu = {"pho", "com tam", "hu tiu"};
        return menu;
    }

//    Menu:
//    - pho
//    - com tam
//    - hu tiu

//    chi co the return 1 value
}
