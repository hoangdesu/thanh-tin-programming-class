import java.util.Scanner;

public class Nov12_Lab {

    public static void main(String[] args) {
//        System.out.println(perfectSquare(16));
//        System.out.println(perfectSquare(16.1));
//        System.out.println(perfectSquare(15));
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please input your first decimal value:");
//        double first = sc.nextDouble();
//
//        System.out.println("Please input your second decimal value:");
//        double second = sc.nextDouble();
//
//        System.out.println("Please input your third decimal value:");
//        double third = sc.nextDouble();
//
//        System.out.println("Input     Square Root as Integer        Perfect Square      ");
//        System.out.printf("%.2f%d\t\t\t\t\t\t%s\n", first, (int) Math.sqrt(first), perfectSquare(first));
//        System.out.printf("%.2f\t%d\t\t\t\t\t\t%s\n", second, (int) Math.sqrt(second), perfectSquare(second));
//        System.out.printf("%.2f\t%d\t\t\t\t\t\t%s\n", third, (int) Math.sqrt(third), perfectSquare(third));

        printAlphabet(3);

    }

    public static boolean perfectSquare(double num) {
//        int numSquareRoot = (int) Math.sqrt(num);
//        double numSquare = Math.pow(numSquareRoot, 2);
//        return num == numSquare;

        double numSqrt = Math.sqrt(num);
        return numSqrt % 1.0 == 0.0; // kiem tra xem sqrt co phan thap phan hay ko
    }


    public static void printAlphabet() {
//        Lv1:
//        a
//        b
//        c
//        d
//        e
//        ...
//        z

//        LV2: 5 chữ cái mỗi dòng
//        in cả bảng chữ cái
//        a b c d e
//        f g h i j

        int col = 1;
        for (int c = 97; c <= 122; c++) {
            System.out.printf("%c ", (char) c);
            col++;
            if (col > 5) {
                col = 1;
                System.out.println();
            }
        }
    }

    public static void printAlphabet(int col) {
        int i = 1;
        for (int c = 97; c <= 122; c++) {
            System.out.printf("%c ", (char) c);
            i++;
            if (i > col) {
                i = 1;
                System.out.println();
            }
        }
    }
}
