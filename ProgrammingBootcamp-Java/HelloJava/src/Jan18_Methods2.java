import java.util.Scanner;

public class Jan18_Methods2 {
    public static void main(String[] args) {
//        hello("Tin");
//        hello("Hoang");

//        int total = add(6, 10);
//        doubleNum(total);

//        String food <- sc.nextLine()

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();
        double circleArea = calculateCircleArea(radius);

        System.out.print("How many circles? ");
        int count = sc.nextInt();

        double totalArea = totalCircleArea(circleArea, count);
        System.out.println("Area of 1 circle is " + circleArea);
        System.out.println("Area of " + count + " circles is " + totalArea);
    }

    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
//        System.out.println(a + b);
        return a + b;
    }

    public static void doubleNum(int a) {
        System.out.println(a * 2);
    }

    public static double calculateCircleArea(double radius) {
//        double PI = 3.14;
//        radius * radius => power
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double totalCircleArea(double areaOfOneCircle, int circleCount) {
        double total = areaOfOneCircle * circleCount;
        return total;
    }

//    void: rỗng -> ham ko tra ve gia tri
//    return keyword: gia tri tra ve cua 1 ham

}
