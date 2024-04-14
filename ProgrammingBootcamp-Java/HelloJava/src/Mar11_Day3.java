import java.util.Scanner;

public class Mar11_Day3 {
    public static void main(String[] args) {
//        System.out.println(1234 % 1000 / 100);
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the landline phone number: ");
//        String landlineNumber = sc.nextLine(); // 61296389386
        String landlineNumber = "61296389386";

//        System.out.print("Please enter the mobile phone number: ");
//        String mobileNumber = sc.nextLine(); // 0416215237

//        System.out.print("+");
//        for (int i = 0; i < landlineNumber.length(); i++) {
//            if (i == 3 || i == 7) {
//                System.out.print(" ");
//            }
//            System.out.print(landlineNumber.charAt(i));
//        }

        StringBuilder formattedLandlineNum = new StringBuilder("+");
        for (int i = 0; i < landlineNumber.length(); i++) {
            if (i == 3 || i == 7) {
                formattedLandlineNum.append(" ");
            }

            formattedLandlineNum.append(landlineNumber.charAt(i));
        }
        System.out.println(formattedLandlineNum);
    }
}
