package Lab.Dec29_Lab13_16_Plant;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
   public static void printArrayList(ArrayList<Plant> garden) {
//      for (Plant p : garden) {
//         p.printInfo();
//      }

      for (int i = 0; i < garden.size(); i++) {
         Plant plant = garden.get(i);
         System.out.println("Plant " + (i+1) + " Information: ");
         plant.printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();

      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName, plantCost, flowerName, flowerCost, colorOfFlowers;
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden

//         System.out.println("Input: " + input);

//         new Plant
//         new Flower

         if (input.equals("plant")) {
            // tạo object plant
            Plant plant = new Plant();

            plantName = scnr.next();
            plantCost = scnr.next();

            plant.setPlantName(plantName);
            plant.setPlantCost(plantCost);

            myGarden.add(plant);

         } else if (input.equals("flower")) {
            Flower flower = new Flower();

            flowerName = scnr.next();
            flowerCost = scnr.next();
            isAnnual = Boolean.parseBoolean(scnr.next());
            colorOfFlowers = scnr.next();

            flower.setPlantName(flowerName);
            flower.setPlantCost(flowerCost);
            flower.setPlantType(isAnnual);
            flower.setColorOfFlowers(colorOfFlowers);

            myGarden.add(flower);
         }

         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
