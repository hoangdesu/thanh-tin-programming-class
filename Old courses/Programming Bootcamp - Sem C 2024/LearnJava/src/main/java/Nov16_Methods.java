public class Nov16_Methods {
    public static void main(String[] args) {
//        method revoke, method call, method execution
        System.out.println(checkLogin("tin", "1234"));
        System.out.println(checkLogin("1234", "tin"));

        printHello();

        double area1 = calculateCircleArea(5);
        double area2 = calculateCircleArea(6);

        System.out.println(area1);
        System.out.printf("%.2f\n", area1);

        System.out.println(area2);
        System.out.printf("%.2f\n", area2);



//        function == method == hàm
    }

//    method definition
//    2 params
//    1 return value (boolean)
    public static boolean checkLogin(String username, String password) {
        String dbUser = "tin";
        String dbPwd = "1234";

        if (username.equals(dbUser) && password.equals(dbPwd)) {
            return true;
        } else {
            return false;
        }

    }

    public static void printHello() {
        System.out.println("Hello!!!!");
    }

    public static double calculateCircleArea(double radius) {
//        2 ^ 3
//        2: base
//        3: power

        return Math.PI * Math.pow(radius, 2);
    }


//    print
}
