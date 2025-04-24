package org.exampleserver;
import io.javalin.Javalin;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);

        app.get("/data", ctx -> {
            System.out.println("Received a request");
            String food = ctx.queryParam("monan");
            System.out.println(food);
            ctx.result("You ordered " + food);

        });
    }
}