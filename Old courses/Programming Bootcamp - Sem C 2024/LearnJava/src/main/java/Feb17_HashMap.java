import java.util.HashMap;

public class Feb17_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> foodByCountry = new HashMap<>();

//        key: value
//        keys cannot be duplicated => can only have 1 key

        foodByCountry.put("vietnam", "pho");
        foodByCountry.put("japan", "sushi");
        foodByCountry.put("korea", "jajangmyeon");

        foodByCountry.put("japan", "ramen");

        System.out.println(foodByCountry.get("japan")); // sushi => ramen

    }
}
