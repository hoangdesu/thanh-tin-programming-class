public class Mar19_CleanVietnamese {
    static String lang = "java";  // class-level scope
    // visible for all methods
    // must use "static" keyword to define class level variables

    public static void main(String[] args) {
        String content = "iPhone 15 Pro Max 'hàng mới' rẻ hơn chính hãng chục triệu đồng";
        content = content.replace("15", "16");

//        System.out.println("Hello " + name);
        // variale "name" is scoped to sayHello method

        System.out.println("Printing lang in main(): " + lang);
        sayHello();
//        System.out.println(content);

//        switch (content) {
//            case "a"

//        }

//        cleanVietnamese -> "iPhone 15 Pro Max 'hang moi' re hon chinh hang chuc trieu dong";


//        String[] games = [lien minh, toc chien, pubg, audition];
//        swapElements(games, 0, 2) => [pubg, toc chien, lien minh, audition];
    }

    public static void sayHello() {
        String name = "Tín"; // function scoped
        System.out.println("Hello " + name);
        System.out.println("Lang in sayHello() method: " + lang);
    }

    // HW: // TODO
//    swapElements(array[], index 1, index 2) -> array[]


//    cleanVietnamese(string) -> string


}

//Python: print("hello")

// Scope Rules:
//- o trong co the nhin ra ngoai
//- o ngoai KO nhin dc vao ben trong

