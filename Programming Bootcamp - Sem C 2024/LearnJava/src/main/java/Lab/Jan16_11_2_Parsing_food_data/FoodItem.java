package Lab.Jan16_11_2_Parsing_food_data;

public class FoodItem {

    String type;
    String name;
    String description;
    boolean available;

    public FoodItem(String type, String name, String description, boolean available) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public String categoryAndName() {
        String result = "";

        result += String.format("%-18s%s", type, name);
        return result;
    }

    public String toString() {
        String result = "";

        result += String.format("%-18s%s", name, description);
        return result;
    }
}
