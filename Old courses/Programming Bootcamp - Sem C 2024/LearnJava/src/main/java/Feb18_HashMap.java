import java.util.HashMap;
import java.util.Map;

public class Feb18_HashMap {
    public static void main(String[] args) {
//        - Hashmap: 1 data structure luu tru thong tin theo cac cap gia tri voi cau truc key-value
//        - Data structures: cac cach sap xep du lieu

//        1. List: static list, array list (dynamic)
//        2. HashMap: key-value pairs

        HashMap<String, String> tin = new HashMap<>();

//        add values into a map
        tin.put("firstname", "Tin");
        tin.put("lastname", "Do");
        tin.put("birthyear", "2004");
        tin.put("university", "RMIT");
        tin.put("food", "com tam");


//        get values from a map
        System.out.println(tin.get("food"));

//        neu key ko co, value se la null
        System.out.println(tin.get("Food")); // null

//        keys must not be duplicated
//        neu put vao trung key da co san, value se bi viet de
        tin.put("food", "pho");
        System.out.println(tin.get("food"));


//        values co the bi trung lap
        tin.put("soup", "pho");
        System.out.println(tin);

//        kiem tra co cap gia tri do trong map hay ko, truoc khi lay ra value
        System.out.println(tin.containsKey("birthyear")); // true
        System.out.println(tin.containsKey("birthday")); // false

//        System.out.println(tin.get("birthyear")); // value is NOT null
//        System.out.println(tin.get("birthyear"));

        if (tin.get("birthyear") != null) {
            System.out.println("contains key birthyear");
            System.out.println("value of key birthyear is: " + tin.get("birthyear"));
        } else {
            System.out.println("does not contain key -> so no value is here");
        }


        // lap qua cac cap gia tri (entries) trong map
//        1 pair = 1 entry

//        1. convert cac key thanh 1 set: keySet() -> Tu key minh lay value
        for (String key : tin.keySet()) {
            System.out.print("Key: " + key);
            System.out.println(" - Value: " + tin.get(key));
        }


//        2. convert thanh cac cap entry
        System.out.println("\n------- using entrySet():");
        for (Map.Entry<String, String> entry : tin.entrySet()) {
            System.out.print("Entry: " + entry);
            System.out.println(" | Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }





    }
}
