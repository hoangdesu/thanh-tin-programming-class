import java.util.Scanner;

public class Dec15_Methods {
    public static void main(String[] args) {
//        methods = functions = hàm

//        methods: functions inside a class

//        re-usable block of code

//        organize the code better

//        sayHello();
//        sayHello();

//        System.out.println(Math.random()); // double: 0.0 -> 0.9999
//        limit: 0 -> 255 (inclusive)
        System.out.println((int) Math.floor(Math.random() * 256)); // 0 -> 255

        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomRGBColor());
        }
    }

//    access modifiers: public, private, protected, (default)

    public static void sayHello() {
        Scanner sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        String firstName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println("Hello " + fullName);

//        System.out.println(generateRandomPassword(10)); => vd: "p4mmjB8QOd"
    }

    public static String generateRandomRGBColor() {
        String red = String.valueOf((int) Math.floor(Math.random() * 256));
        String green = String.valueOf((int) Math.floor(Math.random() * 256));
        String blue = String.valueOf((int) Math.floor(Math.random() * 256));

//        => "rgb(r, g, b)"
        return String.format("rgb(%s, %s, %s)", red, green, blue);
    }

//    generateRandomPassword(int passwordLength)
}
