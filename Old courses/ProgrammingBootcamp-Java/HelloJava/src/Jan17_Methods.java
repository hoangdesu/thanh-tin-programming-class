import java.util.Scanner;

public class Jan17_Methods {
    public static void main(String[] args) {
        hello();
        String name = "";
        System.out.println(name);
        Scanner sc = new Scanner(System.in);
//        System.out.print("What do you like to order: ");
//        String order = sc.nextLine();
//        orderFood(order);

//        input user name
//        input pwd
//        loginUser(username, pswd);

//        System.out.print("Enter username: ");
//        String username = sc.nextLine();
//        System.out.print("Enter password: ");
//        String password = sc.nextLine();
//
//        loginUser(username, password);

        System.out.print("Line1\nLine2\tTab1");
        System.out.println('\n');
        System.out.println("Line3");
//        String input = sc.next();
//        System.out.println(input);

//        '\n': new line character
//        \: escape character
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static void orderFood(String order) {
        String[] menu = {"pho", "com tam", "hu tiu", "bun mam", "com chien"};

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
    }

    public static void loginUser(String username, String password) {
        String usr = "brian";
        String pwd = "123";

        if (username.equals(usr) && password.equals(pwd)) {
            System.out.println("Login successfully!");
        } else {
            System.out.println("Login failed");
        }
    }


//    1 method 0 input
//    1 method 1 input
//    1 method multiple inputs

//    Hoisting:

//    Format code
//    Notion
}
