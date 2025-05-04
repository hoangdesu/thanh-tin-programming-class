package app;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieApp {

    // Name of database file (contained in database folder)
    private static final String DATABASE = "jdbc:sqlite:database/Movies.db";

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year the films were made: ");
        String year = sc.nextLine();

        ArrayList<Movie> movies = getMoviesWithYears(year);

        System.out.println("Movies made after year " + year);
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println(i+1 + ". " + movie.name + ": " + movie.year);
        }

        String queryName = sc.nextLine();


        

    }





    // public static ArrayList<Movie> queryMoviesByName(String name) {
        
    // }

    public static ArrayList<Movie> getMoviesWithYears(String year) {
        ArrayList<Movie> movies = new ArrayList<>();

        Connection connection = null;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query
            String query = """
                SELECT MVTITLE, YRMDE
                FROM MOVIE
                WHERE YRMDE >
            """;

            query += year + ";";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);

            
            while (results.next()) {
                // Create a Movie Object
                Movie movie = new Movie();

                // Lookup the columns we want, and set the movie object field
                // BUT, we must be careful of the column type!
                movie.name  = results.getString("MVTITLE");
                movie.year  = results.getInt("YRMDE");

                // Add the movie object to the array
                movies.add(movie);
            }

            // Close the statement because we are done with it
            statement.close();
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

        // Finally we return all of the movies
        return movies;
    }



    /**
     * Get all of the Movie Titles in the database.
     * This methods needs to be "static" since we are calling it from main()
     */
    public static ArrayList<String> getMovieTitles() {
        // Create the ArrayList to return - of Strings for the movie titles
        ArrayList<String> movies = new ArrayList<String>();

        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC database
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query
            String query = "SELECT * FROM movie";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);

            // Process all of the results
            // The "results" variable is similar to an array
            // We can iterate through all of the database query results
            while (results.next()) {
                // We can lookup a column of the a single record in the
                // result using the column name
                // BUT, we must be careful of the column type!
                String movieName     = results.getString("mvtitle");

                // Store the movieName in the ArrayList to return
                movies.add(movieName);
            }

            // Close the statement because we are done with it
            statement.close();
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

        // Finally we return all of the movie titles
        return movies;
    }


    /**
     * TODO: Fill in this method as an exercise
     * 
     * Get the names of all Movie Stars in the database
     * This methods needs to be "static" since we are calling it from main()
     */
    public static ArrayList<String> getMovieStars() {
        // Create the ArrayList to return - of Strings for the movie titles
        ArrayList<String> starNames = new ArrayList<String>();

        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC database
            connection = DriverManager.getConnection(DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query - TODO: complete this query
            String query = "";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);

            // Process all of the results
            while (results.next()) {
                // TODO: Complete this
            }

            // Close the statement because we are done with it
            statement.close();
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

        // Finally we return all of the movie titles
        return starNames;
    }
}
