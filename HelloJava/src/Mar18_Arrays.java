import java.util.Arrays;

public class Mar18_Arrays {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.printf("Before swap: a = %d, b = %d\n", a, b);

        // ko swap thang trong main, swap trong function
//        int temp = a;
//        a = b;
//        b = temp;

        // swap bang function: pass by value
        swap(a, b);

        System.out.printf("After swap: a = %d, b = %d\n", a, b);

        String[] programmingLanguages = {"Python", "Go"};
        // pass by reference
        changeArrayElement(programmingLanguages);
        System.out.println(Arrays.toString(programmingLanguages));
        // System.out.println(programmingLanguages);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.printf("Inside swap function: a = %d, b = %d\n", a, b);
    }

    public static void changeArrayElement(String[] programmingLanguages) {
        programmingLanguages[0] = "Java";
        programmingLanguages[1] = "TypeScript";
    }
}

//primitive value: cac var binh thuong
//reference (wrapper) value: cac var dc trỏ đến memory address

//- khi truyen primitive value vao function, gia tri cua variable dc copy ra => "pass by value"
//- khi truyen wrapper value, chinh gia tri cua value se dc truyen vao function => "pass by reference"

//CALL 1800-APPLE
