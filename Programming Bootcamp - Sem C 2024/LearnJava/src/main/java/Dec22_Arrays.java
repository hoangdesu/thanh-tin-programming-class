public class Dec22_Arrays {
    public static void main(String[] args) {
        String[] drinks = {"coffee", "tea", "bubble"};

//        for (int i = drinks.length - 1; i >= 1; i--) {
//            System.out.println(drinks[i]);
//        }

        for (int i = 0; i < drinks.length; i++) {
            String dr = drinks[i];
            System.out.println(dr);
        }

//        shortcut for loop
        for (String dr : drinks) {
            System.out.println(dr);
        }
    }
}
