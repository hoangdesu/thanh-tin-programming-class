import java.util.HashMap;

public class Mar27_Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        
        // 1. add key-value pairs
        capitalCities.put("vietnam", "hanoi");
        capitalCities.put("japan", "tokyo");
        capitalCities.put("france", "paris");

//        capitalCities.put("vietnam", "ho chi minh city"); overwrite value

        // 2. access a value from a key
        System.out.println("Capital of japan is " + capitalCities.get("japan"));

        System.out.println(capitalCities);
    }
}

//key-value pairs
//keys must be unique -> cannot have duplicated keys