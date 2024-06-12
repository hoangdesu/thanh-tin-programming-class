package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class HelloName implements Handler {
    @Override
    public void handle(Context ctx) throws Exception {

        String name = ctx.pathParam("name");

        String html = String.format("<h1>Hello %s</h1>", name);
        
        ctx.html(html);
    }
}
