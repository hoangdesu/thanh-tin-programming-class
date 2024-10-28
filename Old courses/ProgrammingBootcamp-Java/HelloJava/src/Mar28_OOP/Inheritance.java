package Mar28_OOP;

public class Inheritance {
    public static void main(String[] args) {
        Vehicle xenaodo = new Vehicle();
        System.out.println("Xe nao do speed: " + xenaodo.limitSpeed);

        Bicycle xemay = new Bicycle();
        System.out.println("Xe may speed: " + xemay.limitSpeed);
        xemay.drive();

        Car oto = new Car();
        System.out.println("Oto speed: " + oto.limitSpeed);
//        System.out.println(oto.power);

        ElectricCar xedien = new ElectricCar();
        System.out.println("xe dien speed: " + xedien.limitSpeed);
        System.out.println("xe dien direction: " + xedien.direction);

        System.out.println(xedien.power);

    }
}

//    1. Inheritance: tính kế thừa
//    2. Encapsulation: tính đóng gói
//    3. Polymorphism: tính đa hình
//    4. Abstraction: tính trừu tượng

//polygon: đa
//poly: nhiều
//morph: shape (hình dạng)

//capsule

//Inheritance:
//- moi tuong quan giua cac class voi nhau
//- class cha: parent class, super class
//- class con: child class, inherited classes




