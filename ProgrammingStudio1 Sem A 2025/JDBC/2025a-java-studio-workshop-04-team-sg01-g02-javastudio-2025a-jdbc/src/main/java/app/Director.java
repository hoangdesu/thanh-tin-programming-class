package app;

public class Director {
    // encapsulation
    private int id;
    private String name;

    public Director(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
