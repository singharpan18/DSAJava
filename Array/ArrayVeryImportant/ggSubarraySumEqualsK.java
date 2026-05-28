package Array.ArrayVeryImportant;
import java.util.*;
import java.util.HashMap;


public class ggSubarraySumEqualsK {

    public static void subarraySum(int[] arr, int k) {

        // Stores prefixSum and list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Prefix sum 0 occurs at index -1
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        int prefixSum = 0;

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Add current number to prefix sum
            prefixSum += arr[i];

            // Check if prefixSum - k exists
            if (map.containsKey(prefixSum - k)) {

                // Get all previous indices
                List<Integer> list = map.get(prefixSum - k);

                // Print all subarrays
                for (int start : list) {

                    System.out.print("Subarray: ");

                    for (int j = start + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }

                    System.out.println();
                }
            }

            // Store current prefix sum index
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        subarraySum(arr, k);
    }
}