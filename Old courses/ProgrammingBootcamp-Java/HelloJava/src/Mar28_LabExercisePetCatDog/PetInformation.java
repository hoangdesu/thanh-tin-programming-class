package Mar28_LabExercisePetCatDog;

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String petType = scnr.nextLine();
        String petName = scnr.nextLine();
        int petAge = scnr.nextInt();


        Pet pet = new Dog(petType, petName, petAge);

        pet.printInfo();

//        Pet pet1 = new Dog("Dog", "d", 200);
//        Pet pet2 = new Cat("Cat", "cat1", 3);

//        pet1.printInfo();
//        pet2.printInfo();

    }
}


