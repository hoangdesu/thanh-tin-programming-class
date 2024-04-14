package Mar22_OOP;

public class Champion {
    protected String game = "Toc chien";
    int health = 100;
    private boolean hasFlash = true;

//    public money = $100;

    // mutator method
    public void damage(int value) {
        this.health = this.health - value;
    }

    // expose through a getter (accessor) method
    public boolean getHasFlash() {
        return this.hasFlash;
    }

//    xinTienMe() {
//        return $50;
//    }
}

//100 - 20 = 80;
