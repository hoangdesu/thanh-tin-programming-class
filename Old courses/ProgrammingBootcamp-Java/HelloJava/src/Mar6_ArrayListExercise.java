import java.util.ArrayList;
import java.util.Scanner;

public class Mar6_ArrayListExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> games = new ArrayList<>();

        // step 1: get user input + add to library
        while (true) {
            System.out.print("Enter your favorite game: ");
            String game = sc.nextLine();

            if (game.equals("exit()")) {
                break;
            }

            games.add(game);
            System.out.printf("Added %s to the game library!\n\n", game);
        }

        // step 2: display all games in your library
        System.out.printf("You have %d games in your library\n", games.size());

        for (int i = 0; i < games.size(); i++) {
            System.out.printf("%d. %s\n", (i+1), games.get(i));
        }

        System.out.println("\nBye!");
    }
}

//Welcome to my Game Library!
//
//Cho phep user nhap ten cac game ho thich vao 1 ArrayList
//Cho den khi user muon dung thi thoi: "exit()"
//
//Sau khi user go "exit()", hien thi tat ca cac game trong thu vien
//
//Enter your favorite game: Lien Minh
//Added Lien Minh to the library!
//
//Enter your favorite game: Toc chien
//Added Toc chien to the library!
//
//Enter your favorite game: exit()
//
//You have 2 games in your library:
//1. Lien Minh
//2. Toc chien
//
//Thank you for using the app.


