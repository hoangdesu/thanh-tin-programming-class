package Mar28_OOP;

public class Example {


    public static void main(String[] args) {
        Food myFood = new Food();
        Food yourFood = new Food();

        // dangerous -> anyone can change the data
//        solution: make the field private
//        myFood.name = "Sushi";

        // if wanna change name, must call setName(newName)
        myFood.setName("Sushi");

        System.out.println(myFood.getName());
        System.out.println(yourFood.getName());

//        chi co the access variable thong qua 1 getter method
//        ko cho phep access truc tiep
        System.out.println(myFood.getRestaurant());
//        myFood.setRestaurant() ??

    }
}
