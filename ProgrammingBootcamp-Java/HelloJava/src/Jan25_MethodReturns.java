public class Jan25_MethodReturns {
    public static void main(String[] args) {
//        int lines = 5;
//        String triangle = buildTriangle(lines);
//        System.out.println("My triangle with " + lines + " lines:");
//        System.out.println(triangle);

//        calculator(a, b, "+, -, *, /")

//        calculator(a, operator, b);
//
//        double result = calculator(2, '+', 6);
//        System.out.println(result); // 8
//
//        calculator(8, '/', 0); // ignored

//        kiem tra string hop le hay ko:
//        - yes: cast qua double
//        - no: error message
    }

//    printTriangle -> buildTriangle
//
//    - input: int lines
//    - output: String triangle

    public static String buildTriangle(int lines) {
        StringBuilder triangle = new StringBuilder();

        for (int row = 1; row <= lines; row++) {
            for (int star = 1; star <= row; star++) {
//                System.out.print("*");
                triangle.append("*");
            }
//            System.out.println();
            triangle.append("\n");
        }

        return triangle.toString();
    }
}
