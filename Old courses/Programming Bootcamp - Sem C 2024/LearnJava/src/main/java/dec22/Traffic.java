package dec22;

public enum Traffic {


    GREEN("Green"),
    YELLOW("Yellow"),
    RED("Res");

    public final String color;

    Traffic(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
