import java.lang.reflect.Array;
import java.util.Arrays;

public class Mar17_NestedArrays {
    public static void main(String[] args) {
        int[][] nestedArray = new int[4][2];
        // - do dai array ngoai: 4
        // - do dai array trong: 2

//        2D nested array: mang 2 chieu
//

//        System.out.println(Arrays.toString(nestedArray));
        for (int[] i : nestedArray) {
            for (int j : i) {
                System.out.printf("i = %s - j = %d\n", Arrays.toString(i), j);
            }
        }

        System.out.println("\nPhone number:\n");

        int[][] phoneNumbers = new int[3][3];
        phoneNumbers[0][0] = 1;
        phoneNumbers[0][1] = 2;
        phoneNumbers[0][2] = 3;

        for (int[] row : phoneNumbers) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(phoneNumbers));

//        3D array
//        X-Y-Z
//        int[][][] threeDArrays = new int[][][];
    }
}
