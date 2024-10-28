import java.util.Scanner;

public class Dec16_HelloJava {
    public static void main(String[] args) {
        System.out.println("Java is fun");

//        Variable naming conventions:
//            camelCase: studentNumber
//            snake_case: student_number

//        student1 OK
//                1student

//        student_1
//                student$_1

//        Creating variables

//        Data types in Java:
//            - int, float, boolean, double, char
//            - String

//        String name = "Tin";

//        System.out.println("Hello " + name);

//        int a = 5;
//        Integer b = 10;
//
//        String bStr = b.toString();
//        String c = "123";
//
//        System.out.println(bStr + c);


//        System.out.println(b.byteValue());

//
//        System.out.println(a + b);

//        2 loai data types trong java:
//            1. primitive types: int, float, boolean, char
//            2. Wrapper (reference) types: String (array of characters), Integer, Float, Boolean, Character

//        Wrapper type = primitive type + methods

//        System.out.println(name.toUpperCase());
//        System.out.println("name length: " + name.length());

//        2 types of programming languages:
//            1. compiled languages: dịch sách. C, C++, Java (1/2), Go.
//            2. interpreted languages: phiên dịch, dịch từng dòng. Python, JavaScript, Java (1/2)...
//
//
//        How Java works:
//        - Java is a compiled + interpreted language
//        - Java Virtual Machine (JVM)




//        Getting user input:
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = sc.nextLine();

//        prompt?
//        println: xuong dong
//        print

        System.out.println("Hello " + name);

        System.out.print("When were you born: ");

        int birthYear = sc.nextInt();

        int age = 2023 - birthYear;

        System.out.println("You are " + age + " years old.");

        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI; // r^2 x pi

        System.out.println("Area of your circle is " + area);

    }
}

//ctrl shift R

//psvm
//sout

