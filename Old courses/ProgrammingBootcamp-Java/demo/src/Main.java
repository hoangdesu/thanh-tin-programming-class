import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        if (name.equals("") || name.length() < 2) {
            name = "ERROR";
        }

        System.out.print("Enter animal: ");
        String animal = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0 || age > 100) {
            age = -1;
        }

        Pet pet;

         if (animal.equals("Dog")) {
            pet = new Dog(name, age);
        } else if (animal.equals("Cat")) {
            pet = new Cat(name, age);
        } else {
             pet = new Pet(name, age);
        }

        pet.printInfo();
    }
}
