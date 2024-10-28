package Apr4_Challenge1;//April5_challenge1task2
import java.util.Scanner;
public class April5_challenge1task2_Tin {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a customer id: ");
        int id =Integer.parseInt (scnr.nextLine());

        System.out.println("Please enter customer full name: ");
        String fullName = scnr.nextLine();

        System.out.println("Already purchased this month (true or false): ");
        boolean purchasedThisMonth = Boolean.parseBoolean(scnr.nextLine());

        int monthsSincePurchase = 0;

        System.out.println("Please enter number of months since last purchase: ");

        monthsSincePurchase = Integer.parseInt(scnr.nextLine());

        System.out.println("Is a member (true or false): ");
        boolean member = Boolean.parseBoolean(scnr.nextLine());

        System.out.println();

        String format = "%-25s%s%n";
        String firstLine = String.format(format, "ID:", id);
        String secondLine = String.format(format, "Full Name:", fullName);

        String thirdLine = String.format(format, "Purchased (this month):", String.valueOf(purchasedThisMonth).toUpperCase());
        String fourthLine = String.format(format, "Months since purchase:", monthsSincePurchase);
        String fifthLine = String.format(format, "Member:",String.valueOf(member).toUpperCase());

        String purchaseStatus = purchasedThisMonth? thirdLine: fourthLine;
        System.out.println(firstLine + secondLine + purchaseStatus + fifthLine);

        if (!purchasedThisMonth && member) {
            System.out.println("You are a valued customer and we have noticed that you have not made a purchase this month.\n" +
                    "We would like to offer you a 25% discount on your next purchase, we would love to see you as an active member again.");
        } else if (purchasedThisMonth && !member) {
            System.out.println("We have noticed that you have made another purchase, we would like to offer you a 25% discount on becoming a member.\n");
        } else if (purchasedThisMonth && member) {
            System.out.println("We hope you are enjoying all your membership benefits, please let us know if there is anything we can do to improve our services.");
        } else if (!purchasedThisMonth) {
            System.out.println("We have noticed that you have not made a purchase this month, we would like to offer you a 50% discount on becoming a member, if you make a purchase within the next 7 days.");
        }



//        if(!purchasedThisMonth){
//            System.out.println("We have noticed that you have not purchased this month, check out our specials page.");
//        }
//        else if (!purchasedThisMonth && !member) {
//            System.out.println(
//                    "We have noticed that you have not made a purchase this month, we would like to offer you a 50% discount on becoming a member, "
//                            + "if you make a purchase within the next 7 days.");
//        } else if (purchasedThisMonth && !member) {
//            System.out.println("You are a valued customer and we have noticed that you have not made a purchase this month.");
//            System.out.println(
//                    "We would like to offer you a 25% discount on your next purchase, we would love to see you as an active member again.");
//        }
//        else if(!member && purchasedThisMonth){
//            System.out.println(
//                    "We have noticed that you have made another purchase, we would like to offer you a 25% discount on becoming a member.");
//        }
//        else {
//            System.out.println(
//                    "We hope you are enjoying all your membership benefits, please let us know if there is anything we can do to improve our services.");
//        }
    }
}