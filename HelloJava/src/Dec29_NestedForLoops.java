import java.util.Scanner;

public class Dec29_NestedForLoops {
    public static void main(String[] args) {
        // nested loops: vòng lặp lồng ghép
        Scanner scanner = new Scanner(System.in);

        // HW1:
//        System.out.print("Enter number of lines for your triangle: ");
//        int lines = scanner.nextInt();
//
//        // outside for: number of rows
//        for (int row = 1; row <= lines; row++) {
//            // inside for: keep track of number of stars
//            for (int star = 1; star <= row; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //    row = 1 -> star: 1->1
        //    row = 2 -> star: 1->2
        //    ...
        //    row = 10 -> star: 1->10

//        HW2:
        System.out.print("Enter number of lines for your Christmas tree: ");
        int lines = scanner.nextInt();

        System.out.print("Enter character: ");
        String character = scanner.next();

//        row     stars         space
//        1       1             4
//        2       3             3
//        3       5             2
//        4       7             1
//        5       9             0

//        26      26+25=51      0
//        x       x + (x-1)     0

//        stars = lines * 2 - 1

        int spaces = lines - 1;

        for (int row = 1; row <= lines; row++) {
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (row + (row-1)); star++) {
                System.out.print(character);
            }
            System.out.println();
            spaces--;
        }

        for (int body = 1; body <= lines - 2; body++) {
            System.out.print(" ");
        }
        System.out.println("|_|");
    }

}
