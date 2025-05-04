package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class May4_MultipleQueries {

    private static final String DATABASE = "jdbc:sqlite:database/Movies.db";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter director's name: ");
        String directorName = sc.nextLine();

        ArrayList<Director> directors = findDirectors(directorName);

        int dirNum = -1;
        String dirName = "";

        if (directors.size() == 1) {
            System.out.printf("Found %d director. Did you mean %s? ", directors.size(), directors.get(0).getName());
            String answer = sc.nextLine();
            if (answer.equals("") || answer.equals("yes")) {
                dirNum = directors.get(0).getId();
                dirName = directors.get(0).getName();
            }

        } else if (directors.size() > 1) {
            System.out.printf("Found %d directors with the name \"%s\":\n", directors.size(), directorName);
            for (int i = 0; i < directors.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, directors.get(i).getName());
            }
            System.out.print("Enter director number: ");
            int selectedNum = sc.nextInt();
            
            // kiểm tra index có hợp lệ hay ko
            while (selectedNum > directors.size()) {
                System.out.print("Wrong number. Please enter again: ");
                selectedNum = sc.nextInt();
            }
            
            int selectedIndex = selectedNum - 1;
            dirNum = directors.get(selectedIndex).getId();
            dirName = directors.get(selectedIndex).getName();
        } else {
            System.out.println("Find 0 directors");
        }

        if (dirNum != -1) {
            ArrayList<String> movies = findMoviesByDirector(dirNum);
            System.out.printf("All Movies by \"%s\":\n", dirName);
            for (int i = 0; i < movies.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, movies.get(i));
            }
        }

    }

    public static ArrayList<Director> findDirectors(String dirName) {
        ArrayList<Director> directors = new ArrayList<>();

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DATABASE);

            // Statement statement = connection.createStatement();
            // statement.setQueryTimeout(30);

            String query = """
                    SELECT DIRNUMB, DIRNAME
                    FROM DIRECTOR
                    WHERE DIRNAME LIKE ?;
                    """;

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, "%" + dirName + "%");
            ps.setQueryTimeout(30);

            ResultSet results = ps.executeQuery();

            while (results.next()) {
                // Movie movie = new Movie();
                // movie.name = results.getString("MVTITLE");
                // movie.year = results.getInt("YRMDE");

                int id = results.getInt("DIRNUMB");
                String name = results.getString("DIRNAME");
                Director newDir = new Director(id, name);

                directors.add(newDir);
            }

            ps.close();
        } catch (SQLException e) {
            // If there is an error, lets just pring the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }

        return directors;
    }

    public static ArrayList<String> findMoviesByDirector(int dirNum) {
        ArrayList<String> movies = new ArrayList<>();

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(DATABASE);
            String query = """
                    SELECT MVTITLE
                    FROM MOVIE
                    WHERE DIRNUMB = ?;
                    """;

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, dirNum);
            ps.setQueryTimeout(30);

            ResultSet results = ps.executeQuery();

            while (results.next()) {
                String movieName = results.getString("MVTITLE");
                movies.add(movieName);
            }

            ps.close();
        } catch (SQLException e) {
            // If there is an error, lets just pring the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }

        return movies;
    }
}

/*
 * -- Case 1: only 1 director
 * Enter director name: allen
 * Found 1 director. Did you mean Allen Woody? yes
 * These are all the movies by director Allen Woody
 * 1. Annie Hall
 * 2. ...
 * 3. ...
 * 
 * 
 * 
 * -- Case 2: multiple directors
 * Enter director name: stanley
 * 
 * Found 2 directors with the name "stanley":
 * 1. Kramer, Stanley
 * 2. Kubrick, Stanley
 * 
 * Enter director number: 2
 * These are the movies by director Kubrick, Stanley:
 * 1. Dr. Strangelove
 * 2. Clockwork Orange
 * 3. 2001
 * 
 * 
 * -- Wrong input case:
 * Enter director number: 3
 * Sorry. No director with number 3. Please enter again:
 * 1. Kramer, Stanley
 * 2. Kubrick, Stanley
 */