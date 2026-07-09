/*
Given an array of integers, print all the leaders in the array.
An element is called a leader if it is greater than all the elements to its right. The rightmost element is always a leader 
because there are no elements to its right.
Return the leaders in the same order as they appear in the array.

Example 1
Input:
arr = [16, 17, 4, 3, 5, 2]
Output:
[17, 5, 2]
*/
package Array.ArrayImportantStriver;

import java.util.*;

public class dLeadersOptimal {

    public static void main(String[] args) {

        // Input array
        int[] arr = {16, 17, 4, 3, 5, 2};

        // To store all leaders
        List<Integer> leaders = new ArrayList<>();

        // Last element is always a leader
        int maxRight = arr[arr.length - 1];

        // Add last element to result
        leaders.add(maxRight);

        // Traverse from second last element towards left
        for (int i = arr.length - 2; i >= 0; i--) {

            // If current element is greater than all elements
            // seen on its right side
            if (arr[i] > maxRight) {

                // Current element becomes new maximum
                maxRight = arr[i];

                // Current element is a leader
                leaders.add(arr[i]);
            }
        }

        // Leaders were added from right to left
        // Reverse to get original order
        Collections.reverse(leaders);

        // Print leaders
        System.out.println(leaders);
    }
}
/*
Time Complexity: O(N) because the array is traversed once from right to left, and reversing the leaders list takes at most O(N). Overall, O(N) + O(N) = O(N).
Space Complexity: O(N) because, in the worst case (e.g., a strictly decreasing array), every element is a leader and is stored in the leaders list.
*/
