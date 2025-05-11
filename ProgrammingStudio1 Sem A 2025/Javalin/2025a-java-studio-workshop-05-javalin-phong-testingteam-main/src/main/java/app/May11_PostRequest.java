package app;
import io.javalin.Javalin;

public class May11_PostRequest {

    public static void main(String[] args) {

        String dbUsername = "tin";
        String dbPwd = "dumaaa";

        Javalin app = Javalin.create().start(7007);


        app.post("/login", ctx -> {
            String requestBody = ctx.body();

            System.out.println("-- REQUEST BODY -- : ");
            System.out.println(requestBody); // tin,hehe

            String[] inputs = requestBody.split(","); // ['tin', 'hehe']
            String username = inputs[0];
            String password = inputs[1];

            if (username.equals(dbUsername) && password.equals(dbPwd)) {
                ctx.result("Login successfully!!!");
            } else {
                ctx.result("Login failed :(((");
            }

        });

        app.post("/login-form", ctx -> {
            String usrname = ctx.formParam("uname");
            String pwd = ctx.formParam("upass");

            String res = usrname + " : " + pwd;
            System.out.println(res);

            ctx.result(res);
        });
    }
}
