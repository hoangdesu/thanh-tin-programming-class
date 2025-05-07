package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class AboutMe implements Handler {
    @Override
    public void handle(Context ctx) throws Exception {
        String name = "Brian Nguyen";
        String description = "Welcome to my website";
        String avatar = "https://avatars.githubusercontent.com/u/38454021?v=4";

        String html = """
                <!DOCTYPE html>
                    <html lang="en">
                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                        <title>{my_name}</title>
                    </head>
                    <body>
                        <h1>{my_name}</h1>
                        <p>{my_description}</p>
                        <img src="{my_avatar}" alt="">
                    </body>
                </html>
                """;

        html = html.replace("{my_name}", name);
        html = html.replace("{my_description}", description);
        html = html.replace("{my_avatar}", avatar);
        
        ctx.html(html);
    }
}
