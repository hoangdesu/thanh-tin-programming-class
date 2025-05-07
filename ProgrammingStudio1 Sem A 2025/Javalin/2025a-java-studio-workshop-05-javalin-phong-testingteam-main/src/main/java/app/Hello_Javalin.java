package app;

import java.util.ArrayList;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

public class Hello_Javalin {

    public static final int         JAVALIN_PORT    = 7001;

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Ca phe sua da");
        drinks.add("Matcha latte");
        drinks.add("Bac xiu");

        Javalin app = Javalin.create()
            .get("/", ctx -> ctx.result("Hello World"))
            .get("/hi", ctx -> ctx.result("Hiiiii"))
            .get("/tin", ctx -> ctx.result("Hello Tin :D"))
            .get("/drinks", ctx -> ctx.json(drinks))
            .get("/me", ctx -> ctx.html("<h1 style=\"color: red;\">About me: Tin Do</h1>"))
            .start(JAVALIN_PORT);
    }
}
