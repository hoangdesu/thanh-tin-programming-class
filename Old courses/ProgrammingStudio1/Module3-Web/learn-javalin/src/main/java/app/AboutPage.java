package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class AboutPage implements Handler {
    @Override
    public void handle(Context ctx) throws Exception {
        String name = "Tin Do";

        String htmlTemplate = """
            <h1>Hello my name is %s</h1>
            <h4>I am %d years old</h4>
            <p style="color: red;">I came from %s
                """;

        int birthYear = 2004;
        int age = 2024 - birthYear;


        String country = "Vietnam";

        htmlTemplate = String.format(htmlTemplate, name, age, country);

        ctx.html(htmlTemplate);
    }
}
