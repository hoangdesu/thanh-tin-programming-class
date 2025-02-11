package Challenge3;
import java.util.Arrays;

public class Task1_Tin {
    public static int[] removeOdds(int[] nums) {
        int[] odds = nums;
        for (int i = 0; i < odds.length; i++) {
            int ood = 0;
            if (!(i % 2 == 0)) {
                System.out.print(odds[i]);
            } else {
                ood = odds[i];
            }
        }

        return odds;
    }

    public static void main(String[] args) {

        int [] input = {1,2,3,4,5,6,7,8,9};
//        int [] result = removeOdds(input);

        // Helper method Arrays.toString() converts int[] to a String
//        int [] result = LabProgram.removeOdds(removeOdds(input));
//        System.out.println(Arrays.toString(result)); // Should print [2, 4, 6, 8]
        System.out.println(Arrays.toString(removeOdds(input)));
    }

}
/* Type your code here */