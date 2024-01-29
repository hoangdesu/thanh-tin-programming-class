import java.util.Scanner;

public class Jan29_Methods_SwitchCase {
    public static void main(String[] args) {

//        String country = scanner...
//        getCapital(country);

//        switch - case: faster than if-else
//        better structure


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country: ");
        String country = sc.nextLine();

        // if (country.equals("vietnam")) {...}
        switch (country) {
            case "vietnam":
                System.out.println("Xin chao");
                break;
            case "japan":
                System.out.println("Konnichiwa");
                break;
            case "korea":
                System.out.println("Annyeong");
                break;
            default:
                System.out.println("Hello");
                break;
        }
    }

//    if country.equals("vietnam || Vietnam || viet nam || Viet Nam || Việt Nam")
//
//

//    Vietnam VIETNAM Viet Nam Việt Nam

    //    "vietnam" -> ha noi
//    if korea -> { seoul }
//    else if japan -> tokyo
//    else if china -> beijing
//    else if france -> paris
//    else if america -> washington D.C

//    else -> capital not found

//    getCapital(String country) -> String capital

}
