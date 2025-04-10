package Dec19_4_OOP_Concepts;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Maine Coon");


//        System.out.println(myCat.name); // ?? -> null
//        myCat.name = "Tom";
//        System.out.println(myCat.name);

//        user.password = "hacked";

        System.out.println(myCat.getName()); // null
        myCat.setName("Jerry");
        System.out.println(myCat.getName()); // Jerry

        System.out.println(myCat.getBreed());

        System.out.println(myCat); // only print object address




//        class: 2 fields & 2 getters + 2 setters

    }
}
