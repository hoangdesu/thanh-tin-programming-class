package Dec28_OOP;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        System.out.println("Vehicle: " + vehicle.engine);
        vehicle.drive();

        Car car = new Car();
        System.out.println("Car: " + car.engine);
        System.out.println("Car wheels: " + car.wheels);
        car.drive();
//        car.race()??


        Bike bike = new Bike();
        System.out.println(bike.engine);
        System.out.println("Bike wheels: " + bike.wheels);
        bike.drive();

        bike.race();

    }
}
