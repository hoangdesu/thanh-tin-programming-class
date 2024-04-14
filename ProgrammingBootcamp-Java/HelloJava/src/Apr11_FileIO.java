import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Apr11_FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        // read content from a file
        FileInputStream fis = new FileInputStream("hello.txt");

        Scanner fileScanner = new Scanner(fis);

//        String fileContent = fileScanner.nextLine();
//
//        System.out.println(fileScanner.hasNext());
//
//        System.out.println(fileContent);
//        System.out.println(fileScanner.nextLine());

//        System.out.println(fileScanner.hasNext());
//        System.out.println(fileScanner.nextLine());

        // read all lines from a file
        int lineCounter = 1;
        while (fileScanner.hasNext()) {
            System.out.println(lineCounter + ". " + fileScanner.nextLine());
            lineCounter++;
        }

        // What music do you listen to: edm
//        - Oh I like EDM too!
//        - I'll give it a try
    }
}
