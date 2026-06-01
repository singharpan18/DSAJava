package Array.ArrayImportantStriver;

import java.util.HashMap;

public class cLargestSubarraySumZeroOptimal {

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If sum becomes 0
            if (sum == 0) {
                maxLength = i + 1;
            }

            // Prefix sum already exists
            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLength = Math.max(maxLength, length);

            } else {

                map.put(sum, i);
            }
        }

        System.out.println("Largest Length = " + maxLength);
    }
}