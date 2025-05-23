package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

public class May12_Thymeleaf {

    public static final int         JAVALIN_PORT    = 7001;
    public static final String      CSS_DIR         = "css/";
    public static final String      IMAGES_DIR      = "images/";

    public static void main(String[] args) {
        // Create our HTTP server and listen in port 7001
        Javalin app = Javalin.create(config -> {
            config.registerPlugin(new RouteOverviewPlugin("/help/routes"));
            
            // Uncomment this if you have files in the CSS Directory
            config.addStaticFiles(CSS_DIR);

            // Uncomment this if you have files in the Images Directory
            config.addStaticFiles(IMAGES_DIR);
        }).start(JAVALIN_PORT);

        app.get("/", ctx -> {
            // ctx.html("<h1>Tin Do</h1>");
            ctx.render("login.html");
        });


        // app.get("/tin", ctx -> {
        //     ctx.render("tindo.html");
        // });

        
        app.get("/user", ctx -> {
            String user = "Đỗ Thành Tín";

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("user", user);
            data.put("country", "Vietnam");
            data.put("image", "https://assets.executivecentre.com/assets/tn_hcmc.jpg");

            ArrayList<String> foodArray = new ArrayList<>() {
                {
                    add("Cơm sườn");
                    add("Sushi");
                    add("Mì cay phô mai");
                }
            };

            data.put("foods", foodArray);

            // {
            //     vietnam: [hanoi, saigon, hue, da nang],
            //     japan: tokyo,
            // }

            ctx.render("user.html", data);
        });

        
    }

 

}
