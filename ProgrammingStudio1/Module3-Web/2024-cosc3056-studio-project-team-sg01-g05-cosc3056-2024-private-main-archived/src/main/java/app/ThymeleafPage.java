package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class ThymeleafPage implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/demo.html";

    private static final String TEMPLATE = "html/demo.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String

        Map<String, Object> model = new HashMap<String, Object>();

        ArrayList<String> cars = new ArrayList<>(List.of("Ferrari", "Porsche", "Aston Martin", "Bently"));
        model.put("cars", cars);

        // Makes Javalin render the webpage using Thymeleaf
        context.render(TEMPLATE, model);
    }
}
