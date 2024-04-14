public class Feb27_Review {
    public static void main(String[] args) {
//        getWorkingHours();

//        lv1: for + if/else + methods
//        8-9: MORNING
//        9-10: MORNING
//        10-11: MORNING
//        11-12: LUNCH
//        12-13: LUNCH
//        13-14: AFTERNOON
//        ...
//        19-20: EVENING
//        20-21: EVENING
//        21-22: EVENING

//        print + format output
//            %: placeholder
//                    - %s: string
//                    - %d: int
//                    - %f: float
//                    - %b: boolean

//        int age = 19;
//        System.out.printf("my name is %s and i am %d years old", "Tín", age);

        String name = "Tin";
        int languages = 3;
        float money = 3000.5f;
        boolean newLaptop = true;
        System.out.printf("Hello my name is %s and I speak %d languages. I'm selling my laptop for %f and new laptop = %b", name, languages, money, newLaptop);






    }


//    day 1 - day 2 trong programming studio
//    - conditionals: if-else
//    - loops: for vs while
//    - input/output
//    - methods


    public static void getWorkingHours() {
        for (int startTime = 8; startTime < 22; startTime++) {
//            System.out.println(startTime + "-" + (startTime+1) + ":");

            String shift = "";

            if (startTime >= 8 && startTime <= 10) {
                shift = "MORNING";
            } else if (startTime >= 19 && startTime <= 21) {
                shift = "EVENING";
            }

            // ...

            System.out.printf("%d-%d: %s\n", startTime, startTime+1, shift);
        }
    }
}
