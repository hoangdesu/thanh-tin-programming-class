package Mar28_OOP;

public class Food {
    private String name = "Hamburger";
    private String restaurant = "Brian's restaurant";
    // encapsulate variable names

    public String getName() {
        return this.name;
    }

//    neu muon change name
//    -> chi co cach viet ham setName

    public void setName(String newName) {
        this.name = newName;
    }

    public String getRestaurant() {
        return this.restaurant;
    }
}