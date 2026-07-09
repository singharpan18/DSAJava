/*
Problem: Largest Subarray with Sum 0
Problem Statement
Given an integer array arr of size N, find the length of the longest subarray whose sum is equal to 0.
Return the maximum length of such a subarray.

Example 1
Input:
arr = [15, -2, 2, -8, 1, 7, 10, 23]
Output:
5

Explanation:
The longest subarray with sum 0 is [-2, 2, -8, 1, 7], whose length is 5.
*/

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
/*
Time Complexity: O(N) because the array is traversed only once, and each HashMap operation (containsKey, get, put) takes O(1) on average.
Space Complexity: O(N) because, in the worst case, the HashMap stores a unique prefix sum for every element in the array.
*/