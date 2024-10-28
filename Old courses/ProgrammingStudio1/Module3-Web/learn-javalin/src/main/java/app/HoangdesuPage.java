package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class HoangdesuPage implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String htmlTemplate = "<h1>Hoangdesu!!!</h1>";

        htmlTemplate += "<a href='/'>Back</a>";
        
        context.html(htmlTemplate);
    }
}
