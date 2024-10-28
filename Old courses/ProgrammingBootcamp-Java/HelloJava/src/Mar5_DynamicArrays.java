import java.util.ArrayList;
import java.util.Arrays;

public class Mar5_DynamicArrays {
    public static void main(String[] args) {
        // static array
//        String[] drinks = new String[100]; // 0 1 2
//
//        drinks[2] = "coffee";
//
//        System.out.println(Arrays.toString(drinks));

//        dynamic array
        ArrayList<String> drinks = new ArrayList<>();

        System.out.println("Before: " + drinks + ". Length: " + drinks.size());

        // them phan tu moi vao cuoi array
        drinks.add("coffee");
        drinks.add("juice");
        drinks.add("whey");
        drinks.add("tea");

        // xoa phan tu
        drinks.removeLast(); // remove tea
        drinks.remove(2); // remove whey

        System.out.println("After: " + drinks + ". Length: " + drinks.size());
    }
}

//static: array tĩnh -> fixed
//dynamic: array động -> grow/shrink theo yêu cầu
//
//=> độ dài của array

//dự trù quá ít: sau này ko scale
//dự trù quá nhiều: dư thừa bộ nhớ -> phí phạm

