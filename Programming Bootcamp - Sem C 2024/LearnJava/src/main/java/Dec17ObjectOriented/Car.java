package Dec17ObjectOriented;

//Chỉ là thiết kế
public class Car {
//    properties / fields / attributes = variables
    int wheels = 4;
    String type = "car";

    String name;
    double price = 1000;

    double speed = 100;

//    constructor: special method
//            to build the object

    Car(String inputName) {
         name = inputName;
    }


//    methods
    public void drive() {
        System.out.println("🚗💨");
    }

    public void increaseSpeed(double newSpeed) {
        speed = newSpeed;
    }
}
