import java.util.Arrays;

public class Jan17_SortStrings {

    public static void main(String[] args) {
        String[] langs = {"python", "javascript", "java", "c", "lua"};
//        sortStrings(langs);
        Arrays.sort(langs);
        System.out.println(Arrays.toString(langs));
        System.out.println("java".compareTo("javascript"));
    }

    public static void sortStrings(String[] arr) {

    }
}
