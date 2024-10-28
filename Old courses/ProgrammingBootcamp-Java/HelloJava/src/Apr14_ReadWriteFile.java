import java.io.*;
import java.util.Scanner;

public class Apr14_ReadWriteFile {
    public static void main(String[] args) throws IOException {
//        1. read all current users in the file
        String file = "./src/userDatabase.txt";

        FileInputStream fis = new FileInputStream(file);
        Scanner fsc = new Scanner(fis);

        StringBuilder currentFileContent = new StringBuilder();

        System.out.println("All users: ");

        int counter = 1;
        while (fsc.hasNext()) {
            String line = fsc.nextLine();
            currentFileContent.append(line);
            currentFileContent.append('\n');

            int stopIndex = line.indexOf(":");
            String username = line.substring(0, stopIndex);

            System.out.printf("\t%d. %s\n", counter, username);
            counter++;
        }

//        System.out.println("Current file content:\n" + currentFileContent);


//        2. create new users, add to database
        FileOutputStream fos = new FileOutputStream(file);
        PrintWriter pw = new PrintWriter(fos);

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = userInput.nextLine();
        System.out.print("Enter password: ");
        String password = userInput.nextLine();

        // write current content before adding new user
        pw.print(currentFileContent.toString());

//        username:password
        String newUser = String.format("%s:%s", username, password);

        pw.print(newUser);
        System.out.println("Created user " + username + " successfully!");

        pw.close();
    }

}
