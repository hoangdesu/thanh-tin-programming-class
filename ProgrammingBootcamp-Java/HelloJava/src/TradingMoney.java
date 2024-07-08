import java.util.Scanner;

public class TradingMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("let's enter your money: ");
        double money = sc.nextDouble();
        System.out.println("your money changes: ");
        double vietNam = 25_000;

        double change = money * vietNam;
        System.out.printf("%.2f USD = %,02f VND", money, change);
    }
}

//2 USD = 25000 VND