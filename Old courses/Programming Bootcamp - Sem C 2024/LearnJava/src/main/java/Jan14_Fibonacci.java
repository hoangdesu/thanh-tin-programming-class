import java.util.Scanner;

public class Jan14_Fibonacci {

    static class Student {
        String name;
        Student(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        getFibonacciArray(4) -> {0,1,1,2}

        int a = 1;
        int b = 5;

//        swap
//        int c = a; // c = 1
//        a = b; // a = 5
//        b = c; // b = 1

        swap(a, b);

        System.out.println("outside swap function:");
        System.out.println("a = " + a); // 5
        System.out.println("b = " + b); // 1


//        String name = "Tin";
//        rename(name);
//        System.out.println(name);

        Student s = new Student("Tin");
        rename(s);
        System.out.println(s.name);


//        pass by reference vs pass by value

//        - primitive types: values are copied
//        byte, long, int, boolean, char, double, float,...
//        - reference / wrapper types: primitive type + methods
//        String, Integer, Scanner, Math, Long, Float,
//        mutable: thay đổi data trực tiếp trên object gốc

//        int x = 5;
//        Integer y = 10;
//
//        System.out.println(x + y);

    }

    public static int[] getFibonacciArray(int length) {
        int[] fib = new int[10];
        return fib;
    }

    public static void swap(int a, int b) {
        int c = a; // c = 1
        a = b; // a = 5
        b = c; // b = 1

        System.out.println("inside swap function:");
        System.out.println("a = " + a); // 5
        System.out.println("b = " + b); // 1
    }

    public static void rename(Student s) {
        s.name = "Tin Do";
    }

//    Methods: functions inside a class

}
