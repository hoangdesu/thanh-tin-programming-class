package dec22;

public class Main {
    public static void main(String[] args) {
        Drink myDrink = new Drink();

        System.out.println(myDrink.name);

        System.out.println(myDrink);

        System.out.println(Traffic.GREEN);
        System.out.println(Traffic.valueOf("RED"));
    }
}
