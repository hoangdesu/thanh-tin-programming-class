import java.util.Scanner;

public class Mar12_ThanSoHocSolution {
    public static void main(String[] args) {
//        Scanner sc =
        String dobTin = "01/11/2004";
        String dobHoang = "26/02/1995"; //
        Scanner sc = new Scanner(System.in);

        int myThanSoHoc = tinhThanSoHoc(sc.nextLine());
        System.out.println("Than so hoc cua ban la: " + myThanSoHoc);
    }

    public static int tinhThanSoHoc(String dob) {
        int total = 0;
        for (int i = 0; i < dob.length(); i++) {
            // check if the character is numeric
            // if yes, add to total
            // if no, skip and move on to next char

            if (Character.isDigit(dob.charAt(i))) {
//                System.out.println(dob.charAt(i) + ": is a number");
                total += Character.getNumericValue(dob.charAt(i)); // character
//                 cach 2: total += Integer.parseInt(String.valueOf(dob.charAt(i)));
            }
        }

        int thanSoHoc = total;
        if (total > 9) {
            String totalStr = String.valueOf(total);
            thanSoHoc = Character.getNumericValue(totalStr.charAt(0)) + Character.getNumericValue(totalStr.charAt(1));
        }

        return thanSoHoc;
    }


}

//userIsAuthenticated -> boolean
//userCanPost -> boolean
