package Array.ArrayVeryImportant;

import java.util.Arrays;
import java.util.HashMap;


public class cTwoSum {    

    public static int[] twoSum(int[] arr, int target) {

        // Stores number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            // Find remaining value needed
            int complement = target - current;

            // If complement already exists
            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }

            // Store current element and index
            map.put(current, i);
        }

        // If no pair found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}