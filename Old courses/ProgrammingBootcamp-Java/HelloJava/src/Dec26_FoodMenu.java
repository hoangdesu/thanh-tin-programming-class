import java.util.Scanner;

public class Dec26_FoodMenu {
    public static void main(String[] args) {
        String[] menu = {"pho", "com tam", "hu tiu", "bun mam", "com chien"};

        Scanner sc = new Scanner(System.in);

        System.out.print("What would you like to order: ");
        String order = sc.nextLine();

        // Linear search algorithm
        boolean foodExists = false;
        for (int i = 0; i < menu.length; i++) {
            if (order.equals(menu[i])) {
//                System.out.println("Your order has been placed!");
                foodExists = true;
            }
        }

        if (foodExists) {
            System.out.println("Your " + order + " will be ready in 5 minutes");
        } else {
            System.out.println("Sorry we don't have " + order);
        }

//        HW1: in tam giac
//
//        - Enter number of lines: 5
//        - Print:
//        *
//        **
//        ***
//        ****
//        *****
//
//        HW2: in cay thong
//            - Enter number of lines: 5
//            *
//           ***
//          *****
//         *******
//        *********
//           |_|

//        hint: for, maybe cần 2 for loops (cũng có thể dùng while)
//        hint cay thong: tìm mối liên hệ giữa số lượng ký tự versus số lượng dòng + số lượng khoảng trắng
    }
}
