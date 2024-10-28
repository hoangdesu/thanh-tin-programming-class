import java.util.Scanner;

public class Jan6_Practice {
    public static void main(String[] args) {
//        Practice

//        Login program

//        2 variables to store username & password

//        String username = 'tin';
//        String password = 'hi';
//
//        Enter username: 'tin'
//        Enter password: 'hi'
//
//        Login successfully!
//
//        3 attempts
//
//        Enter username: 'tin'
//        Enter password: 'hello'
//
//        -> Login failed. You have 2 more attempts.
//
//        Enter username: 'tin'
//        Enter password: 'hello'
//
//        -> Login failed. You have 1 attempt.
//
//        Enter username: 'tin'
//        Enter password: 'hello'
//
//        -> Login failed. Your account has been locked!
//
//        compare + for
//        string methods

        Scanner scanner = new Scanner(System.in);

        String username = "brian";
        String password = "wassup#";

        for (int attempt = 2; attempt >= 0; attempt--) {
            System.out.print("Enter username: ");
            String usr = scanner.nextLine();
            System.out.print("Enter password: ");
            String pwd = scanner.nextLine();

            if (username.equals(usr) && password.equals(pwd)) {
                System.out.println("Login successfully!");
                break;
            } else {
                String unit;
                if (attempt > 1) {
                    unit = "attempts";
                } else {
                    unit = "attempt";
                }
                if (attempt == 0) {
                    System.out.println("Login failed. Your account has been locked");
                } else {
                    System.out.println("Login failed. You have " + attempt + " more " + unit);
                }
            }
        }




//        for (start; stop; step)
    }
}
