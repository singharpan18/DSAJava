package Array.ArrayVeryImportant;
import java.util.HashMap;

//Find the total number of continuous subarrays whose sum is equal to k.

public class gSubarraySumEqualsK {

    public static int subarraySum(int[] arr, int k) {

        // Stores prefixSum and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        // Traverse array
        for (int num : arr) {

            // Add current number to prefix sum
            prefixSum += num;

            // Check if prefixSum - k exists
            if (map.containsKey(prefixSum - k)) {

                count += map.get(prefixSum - k);
            }

            // Store current prefix sum frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(arr, k));
    }
}