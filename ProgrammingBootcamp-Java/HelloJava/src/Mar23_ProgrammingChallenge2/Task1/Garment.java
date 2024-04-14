package Mar23_ProgrammingChallenge2.Task1;


public class Garment {

    private String name;
    private String colour;
    private int size;


    public Garment(String name, String colour, int size) {
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }


    public String toString() {
        return name + " " + "(" + colour + " - " + size + ")";
    }
}
