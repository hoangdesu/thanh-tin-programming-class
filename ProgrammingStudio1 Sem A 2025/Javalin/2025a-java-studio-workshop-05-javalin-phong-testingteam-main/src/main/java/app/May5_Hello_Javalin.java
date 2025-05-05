package app;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;


public class May5_Hello_Javalin {

    public static final int         JAVALIN_PORT    = 7001;

    public static void main(String[] args) {

        Javalin app = Javalin.create()
            .get("/", ctx -> ctx.result("Hello World"))
            .get("/hi", ctx -> ctx.result("Hiiiii"))
            .get("/tin", ctx -> ctx.result("Hello Tin :D"))
            .start(JAVALIN_PORT);
    }
}
