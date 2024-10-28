package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class Carapp implements Handler {
    @Override
    public void handle(Context ctx) throws Exception {
        String[] cars = { "Mercedes", "McLaren", "BMW", "Lexus", "Audi" };

        String htmlTemplate = """
                <h1>My favorite cars:</h1>
                <ul>
                    %s
                <ul>
                """;

                
        StringBuilder carList = new StringBuilder();
                
        // <li>{cars[i]}</li>
        for (String car : cars) {
            String listElement = String.format("<li>%s</li>", car);
            carList.append(listElement);
        }

        htmlTemplate = String.format(htmlTemplate, carList.toString());

        ctx.html(htmlTemplate);
    }
}
