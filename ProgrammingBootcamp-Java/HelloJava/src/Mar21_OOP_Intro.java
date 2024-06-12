import java.util.Scanner;

public class Mar21_OOP_Intro {

    // thiet ke class
    public static class Car {
        // class fields: share chung cho tat ca cac object
        int wheels = 4;
        String license = "B1";
        boolean isValid = true;

        // separated fields
        String brand;
        float price;

        // constructor: hàm giúp xây dựng các object với các fields khác nhau
//        constructor là hàm có chung tên với class
        public Car(String brand, float retailPrice) {
            this.brand = brand;
            this.price = retailPrice;
        }

        // class methods
        public void drive() {
            System.out.println(this.brand + " vrum vrum 🚗");
        }
    }

    public static void main(String[] args) {
//        Scanner -> 1 class
//     ten_class ten_object
        Scanner sc = new Scanner(System.in);


        // create objects from class Car
        Car mercedes = new Car("mercedes", 2000);
        Car audi = new Car("audi", 3000);

        // dot notation: access cac phan tu (props) va hanh dong (methods)

        // shared properties
        System.out.println("Mercedes wheels: " + mercedes.wheels);
        System.out.println("Audi wheels: " + audi.wheels);

        // separate properties
        System.out.printf("Price of %s = $%.0f\n", audi.brand.toUpperCase(), audi.price);
        System.out.printf("Price of %s = $%.2f\n", mercedes.brand.toUpperCase(), mercedes.price);


        //  sc.nextLine();
        ////        sc.

        // shared methods
        audi.drive();
        mercedes.drive();

//        2 groups of data types:
//        - int, float, char, double, boolean -> primitive type
//        - String, Integer, Float, Double, Car, Boolean, Scanner -> wrapper / reference type



        String name = "...";

//        built-in type in Java


//        String test = "";
//        test.toUpperCase();
    }
}
