package app;

import java.nio.file.Path;
import java.util.ArrayList;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

public class May10_Params {

    public static final int JAVALIN_PORT = 7001;

    public static void main(String[] args) {

        Javalin app = Javalin.create().start(JAVALIN_PORT);

        // Path params
        // localhost:7001/add/5/2

        // Trả về HTML: <h1>5 + 2 = 7</h1>

        app.get("/add/:a/:b", ctx -> {
            String a = ctx.pathParam("a");
            String b = ctx.pathParam("b");

            try {
                int aNum = Integer.valueOf(a);
                int bNum = Integer.valueOf(b);
                int result = aNum + bNum;

                String template = String.format("%d + %d = <b>%d</b>", aNum, bNum, result);
                // aNum + " + " + bNum + " = " + result

                ctx.html(template);
            } catch (NumberFormatException e) {
                ctx.html("Invalid format for numbers a or b");
            }
            
        });

        
        // Query params
        // /multiply?x=5&y=10
        app.get("/multiply", ctx -> {
            String x = ctx.queryParam("x");
            String y = ctx.queryParam("y");

            if (x == null || y == null) {
                ctx.html("Missing data. Please input values for x and y from the query params");
                return; // break
            }

            int res = Integer.valueOf(x) * Integer.valueOf(y);

            String html = x + " x " + y + " = " + "<b>" + res + "</b>";
            
            ctx.html(html);
        });





    }
}
