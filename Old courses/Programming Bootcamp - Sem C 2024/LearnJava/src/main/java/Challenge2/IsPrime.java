package Challenge2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your number:");
//        ...

//        isPrime(num)

//        System.out.println("You entered the number: 2 which is a prime number.");


        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(4)); // false
        System.out.println(isPrime(19)); // true
        System.out.println(isPrime(2)); // true

    }

    private static boolean isPrime(int num) {
//        so nguyen to: chia het cho 1 va chinh no

//        num % 1 == 0 -> true
//        num % num == 0 -> true

//        => kiem tra num co chia het cho khoang so tu [2 -> num-1] hay ko
//        neu co bat ky 1 so nao do trong khoang so tren chia het cho num
//        => ket luan num KHONG phai la so nguyen to

//        special case
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

//        finish vong lap, ma van ko co so nao chia het cho num
//        => ket luan so nay la prime

        return true;
    }
}
