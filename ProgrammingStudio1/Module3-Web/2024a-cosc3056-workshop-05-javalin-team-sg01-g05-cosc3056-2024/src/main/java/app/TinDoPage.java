package app;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class TinDoPage implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String htmlTemplate = "<h1>Tin dep zai khoai to 6 mui =))!</h1>";
        
        htmlTemplate += "<a href='/'>Back</a>";
        context.html(htmlTemplate);
    }
}
