import java.util.Scanner;

public class Jun5_Template {
    public static void main(String[] args) {
        System.out.print("What is your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        Template
        System.out.printf("Hello %s!", name);
    }
}
