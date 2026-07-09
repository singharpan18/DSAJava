/*
Problem Statement
Rearrange Array Elements by Sign
You are given an integer array nums containing an equal number of positive and negative integers.

Rearrange the array so that:
Every positive number is followed by a negative number.
The relative order of positive numbers remains the same.
The relative order of negative numbers remains the same.
The rearranged array starts with a positive number.

Return the rearranged array.
Example 1
Input:
nums = [3,1,-2,-5,2,-4]
Output:
[3,-2,1,-5,2,-4]
*/
package Array.ArrayImportantStriver;
import java.util.Arrays;

public class eRearrangeBySign {

    public static int[] rearrangeArray(int[] nums) {

        // Result array
        int[] result = new int[nums.length];

        // Next position for positive number
        int posIndex = 0;

        // Next position for negative number
        int negIndex = 1;

        // Traverse original array
        for (int num : nums) {

            // If current number is positive
            if (num > 0) {

                // Place positive at even index
                result[posIndex] = num;

                // Move to next even index
                posIndex += 2;
            }
            else {

                // Place negative at odd index
                result[negIndex] = num;

                // Move to next odd index
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
/*
Time Complexity: O(N) because the array is traversed only once, and each element is placed into the result array in constant time.
Space Complexity: O(N) because an additional array of size N is used to store the rearranged elements.
*/