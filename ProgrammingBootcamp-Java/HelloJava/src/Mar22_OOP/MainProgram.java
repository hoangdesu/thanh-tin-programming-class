package Mar22_OOP;

public class MainProgram {

    // access modifiers: dat truoc 1 ham hoac bien de show pham vi (scope)
//    - public: visible to all other classes (default)
//    - private: visible only within the class
//    - protected: visible only within the same package

//    public static class Champion {
//        private String game = "League of Legends";
//
//    }



    public static void main(String[] args) {
        Champion yasuo = new Champion();
        System.out.println(yasuo.game);

        System.out.println("Original health: " + yasuo.health); // 100
        yasuo.damage(30); // calling mutator method on yasuo object
        System.out.println("After yasuo damaged: " + yasuo.health); // 70

        Champion ahri = new Champion();
        System.out.println(ahri.game);

        System.out.println("Ahri health: " + ahri.health);
//        System.out.println(ahri.hasFlash); // => error
        System.out.println("Ahri has flash: " + ahri.getHasFlash());


//        lay tien: tin.money + =

    }
}
