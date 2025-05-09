package app;

import java.util.ArrayList;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

public class May9_Params {

    public static final int JAVALIN_PORT = 7001;
    public static final String CSS_DIR = "css/";
    public static final String IMAGES_DIR = "images/";

    public static void main(String[] args) {

        ArrayList<String> menu = new ArrayList<>();
        menu.add("Com tam");
        menu.add("Mi hoanh thanh");
        menu.add("Bun dau mam tom");

        Javalin app = Javalin.create(config -> {
            config.registerPlugin(new RouteOverviewPlugin("/help/routes"));
        }).start(JAVALIN_PORT);

        // Configure Web Routes
        // configureRoutes(app);

        // Path param: "/hi/:name"
        // Query param: "/hi?name=tin"

        // Route handlers
        // 1. Path param
        app.get("/hello/:username", ctx -> {
            String name = ctx.pathParam("username");
            ctx.result("Hello " + name);
        });

        // 2. Query params (query string)
        // "http://localhost:7001/hi?name=tin&age=20"
        app.get("/hi", ctx -> {
            String name = ctx.queryParam("name");

            if (name == null) {
                name = "Guest";
            }

            String age = ctx.queryParam("age");

            ctx.html("<h1>Hi " + name + ". You are " + age + " years old!</h1>");

        });

        app.get("/menu", ctx -> {
            // ?option=data

            String option = ctx.queryParam("option");
            if (option != null && option.equals("data")) {
                ctx.json(menu);
            } else {
                String html = """
                        <!DOCTYPE html>
                            <html lang="en">
                            <head>
                                <meta charset="UTF-8">
                                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                                <title>Menu</title>
                            </head>
                            <body>
                                <h1>Menu</h1>
                                <ul>
                            """;

                for (String food : menu) {
                    html += "<li>" + food + "</li>";
                }

                html += """
                        </ul>
                        </body>
                        </html>
                        """;

                ctx.html(html);           
            }
        });


        // adding a new food
        app.get("/menu/add/:newFood", ctx -> {
            String newFood = ctx.pathParam("newFood");
            menu.add(newFood);

            String res = """
                <p>Added <b>{newFood}</b> successfuly to the database!</p>
                <a href='/menu'>Go back to menu</a>
                    """;

            res = res.replace("{newFood}", newFood);

            ctx.html(res);
        });

    }
}
