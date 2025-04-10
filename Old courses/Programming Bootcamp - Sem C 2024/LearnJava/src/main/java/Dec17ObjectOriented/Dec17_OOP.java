package Dec17ObjectOriented;

public class Dec17_OOP {

//    static class Car {
//
//    }

//    static

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes");
        Car ferrari = new Car("Ferrari");

//        object: instance of a class
        System.out.println(mercedes.wheels);
        System.out.println(ferrari.wheels);

        mercedes.drive();
        ferrari.drive();

        System.out.println(mercedes.name);
        System.out.println(ferrari.name);

        System.out.println(mercedes.price);
        System.out.println(ferrari.price);

        System.out.println("Mercedes first speed: " + mercedes.speed);
        mercedes.increaseSpeed(150);
        System.out.println("Mercedes after increase speed: " + mercedes.speed);

        System.out.println("Ferrari speed: " + ferrari.speed);
    }
}
