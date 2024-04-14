package Apr4_Challenge1;

import java.util.HashMap;

public class Task3_Mode {
    public static void main(String[] args) {
//        tinh mode
//        [7 1 17 19 19 19 17 1]
//        => [[7, 1], [1, 2], [17, 2], [19, 3]]
//
//        {
//            7: 1,
//            1: 2,
//            17: 2,
//            19: 3
//        }

        int[] nums = {7, 1, 17, 19, 19, 19, 17, 1};

        HashMap<Integer, Integer> numFrequency = new HashMap<>();

//        numFrequency.put(7, 2);
//        numFrequency.put(19, 3);
//        numFrequency.put(19, 5);
//
//        int currentValue = numFrequency.get(19);
//        System.out.println(currentValue);
//        numFrequency.put(19, currentValue+1);

//        System.out.println(numFrequency);
        for (int num : nums) {
            if (!numFrequency.containsKey(num)) {
                numFrequency.put(num, 1);
            } else {
                int currentOccurrence = numFrequency.get(num);
//                System.out.println(num + ":" + currentOccurrence);
                int updatedOccurrence = currentOccurrence + 1;
                numFrequency.put(num, updatedOccurrence);
            }
        }

        System.out.println("keyset: " + numFrequency.keySet());

        Object[] keyArray = numFrequency.keySet().toArray();

//        tim mode
        int mode = numFrequency.get((int) keyArray[0]);
        for (int i = 0; i < keyArray.length; i++) {
//            System.out.println("key: " + keyArray[i]);
//            System.out.println("value: " + );

            int key = (int) keyArray[i];
            int value = numFrequency.get((int) keyArray[i]);
            if (value > mode) {
                mode = key;
            }
        }

        System.out.println(numFrequency);
        System.out.println("Mode: " + mode);
    }
}

