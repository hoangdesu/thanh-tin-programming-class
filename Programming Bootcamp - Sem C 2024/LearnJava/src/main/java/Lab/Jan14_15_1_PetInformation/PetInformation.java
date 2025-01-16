package Lab.Jan14_15_1_PetInformation;

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String petType = scnr.nextLine();
        String petName = scnr.nextLine();
        int petAge = scnr.nextInt();


        Pet pet = new Cat(petType, petName, petAge);
        pet.printInfo();


    }
}



