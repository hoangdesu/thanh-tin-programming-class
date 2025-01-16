import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jan16_Files {
    public static void main(String[] args) throws FileNotFoundException {
//        String file = "./src/main/java/food.txt";
        File file = new File("./src/main/java/food.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        Scanner fileScanner = new Scanner(fileInputStream);

        StringBuilder sb = new StringBuilder();
        while (fileScanner.hasNext()) {
//            System.out.println(fileScanner.next());
            sb.append(fileScanner.nextLine());
        }

        System.out.println(sb.toString());

    }
}
