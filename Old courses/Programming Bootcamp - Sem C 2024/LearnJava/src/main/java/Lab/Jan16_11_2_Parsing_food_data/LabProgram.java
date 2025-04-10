package Lab.Jan16_11_2_Parsing_food_data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        // Getting file input
        System.out.println("Please input the name of the text file.\n");

        Scanner scnr = new Scanner(System.in);
        String selectedFile = scnr.nextLine();

        // Reading food info from files: food.txt or food1.txt
        String path = "./src/main/java/Lab/Jan16_11_2_Parsing_food_data/";
        String file = path + selectedFile;
        FileInputStream fis = new FileInputStream(file);

        Scanner fileScanner = new Scanner(fis);

//        Create a food item array
        ArrayList<FoodItem> foodItemArray = new ArrayList<>();

//        Loop through each line in the file, read each line using scanner
        while (fileScanner.hasNext()) {
//            System.out.println(fileScanner.nextLine());
//            fileSb.append(fileScanner.nextLine());

//            Extract each food item on each row
            String foodRow = fileScanner.nextLine();
//            System.out.println(foodRow);

//            Split each attribute on food row using the tab character into a String array
            String[] splittedFoodRow = foodRow.split("\t");
//            System.out.println(Arrays.toString(splittedFoodRow));

//            Extract each attribute using from the string array
            String type = splittedFoodRow[0];
            String name = splittedFoodRow[1];
            String description = splittedFoodRow[2];
//            String availableStr = splittedFoodRow[3];
//            boolean isAvailable;
//            if (availableStr.equals("Available")) {
//                isAvailable = true;
//            } else {
//                isAvailable = false;
//            }

//            Ternary
            boolean isAvailable = splittedFoodRow[3].equals("Available");

//            create a foodItem object from the extracted values
            FoodItem foodItem = new FoodItem(type, name, description, isAvailable);
//            System.out.println(foodItem);

//            Store the new food item object into the food array list
            foodItemArray.add(foodItem);
        }

//        System.out.println(foodItemArray);
//        Prints out a list of the item's descriptions only if they are marked as available.
        for (FoodItem item : foodItemArray) {
//            System.out.println(item + " - "  + item.available);

            if (item.available) {
                System.out.println(item.description);
            }
        }


//        Sorts the array of items using the selection sort algorithm based on their category/type.
//Prints the available items again using the categoryAndName method.
        ArrayList<FoodItem> sortedTypeFoodItem = sortFoodItemArray(foodItemArray);
        // sort the array by type

        System.out.println("\n");
        System.out.println("Sorted (Category)");

        for (FoodItem item : sortedTypeFoodItem) {
            System.out.println(item.categoryAndName());
        }

//        Sorts the array of items again using the selection sort algorithm based on their name.
        // TODO: not done
        ArrayList<FoodItem> sortedNameFoodItem = (ArrayList<FoodItem>) foodItemArray.clone();
        System.out.println("\n\nSorted (Category & Name)");
        for (FoodItem item : sortedNameFoodItem) {
            System.out.println(item.categoryAndName());
        }

    }

    public static ArrayList<FoodItem> sortFoodItemArray(ArrayList<FoodItem> foodItemArray) {
        System.out.println("--- START SORT METHOD");
        ArrayList<FoodItem> sortedTypeFoodItemArray = (ArrayList<FoodItem>) foodItemArray.clone();

//        System.out.println(sortedTypeFoodItem);

//        System.out.println("a".compareTo("b"));

//        Selection sort
        for (int i = 0; i < sortedTypeFoodItemArray.size() - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < sortedTypeFoodItemArray.size(); j++) {
                FoodItem currentItem = sortedTypeFoodItemArray.get(j);
                String currentType = currentItem.type;

                FoodItem itemWithSmallestIndex = sortedTypeFoodItemArray.get(smallestIndex);
                String itemWithSmallestIndexType = itemWithSmallestIndex.type;

                if (currentType.compareTo(itemWithSmallestIndexType) < 0) {
                    smallestIndex = j;
                }

                FoodItem temp = sortedTypeFoodItemArray.get(i);
                sortedTypeFoodItemArray.set(i, sortedTypeFoodItemArray.get(smallestIndex));
                sortedTypeFoodItemArray.set(smallestIndex, temp);

            }
//            System.out.println(sortedTypeFoodItemArray.get(i));
        }

//        System.out.println(sortedTypeFoodItemArray);
//        for (FoodItem item : sortedTypeFoodItemArray) {
//            System.out.println(item.type);
//        }
//
//        System.out.println("--- END SORT METHOD");
        return sortedTypeFoodItemArray;
    }
}

//[aab, aaa]

//drh
//dri
//drj


