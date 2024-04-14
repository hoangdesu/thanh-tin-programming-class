import java.io.*;
import java.util.Scanner;

public class Apr14_Files {
    public static void main(String[] args) throws IOException {
        // read file
        FileInputStream fis = new FileInputStream("./src/secret.txt");
        Scanner fileSc = new Scanner(fis);

        System.out.println(fileSc.nextLine());
//        System.out.println(fileSc.nextLine());

//        write file


        FileOutputStream fos = new FileOutputStream("drinks.txt");
        PrintWriter pw = new PrintWriter(fos);

        Scanner inputSc = new Scanner(System.in);

        System.out.print("What drink do you like: ");
        String userInput = inputSc.nextLine();

        pw.print("User's favorite drink: ");
        pw.write(userInput);


//        pw.println("coffee");
//        pw.write("tra sua");



        pw.close();

    }
}
