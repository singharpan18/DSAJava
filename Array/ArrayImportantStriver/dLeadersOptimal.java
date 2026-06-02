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