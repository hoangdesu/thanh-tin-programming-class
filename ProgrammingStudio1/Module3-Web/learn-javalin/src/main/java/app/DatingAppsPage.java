package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

// public class DatingAppsPage implements Handler {
//     @Override
//     public void handle(Context ctx) throws Exception {
        
//     }
    
// }

public class DatingAppsPage implements Handler {
    public static String DRIVER = "jdbc:sqlite";
    public static String DATABASE_FOLDER = "database";
    public static String DATABASE = "dating-apps.db";

    public static String DATABASE_URI = String.format("%s:%s/%s", DRIVER, DATABASE_FOLDER, DATABASE);
    // "jdbc:sqlite:database/dating-apps.db"

    @Override
    public void handle(Context ctx) throws Exception {
        Connection connection = null;

        System.out.println(DATABASE_URI);

        ArrayList<String> datingApps = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(DATABASE_URI);

            Statement statement = connection.createStatement();

            String query = """
                    SELECT Name
                    FROM Apps;
                    """;

            ResultSet results = statement.executeQuery(query);

            // while scanner.hasNext() {
            //     scan next line from the file into the app
            // }

            while (results.next()) {
                String app = results.getString("Name");
                datingApps.add(app);
            }

            statement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
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

        System.out.println("All the dating apps: " + datingApps);
        ctx.result(datingApps.toString());
    }
}
