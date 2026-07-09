/*
Problem: Print the Longest Consecutive Sequence
Problem Statement

Given an unsorted integer array nums, print the longest sequence of consecutive integers present in the array.

Consecutive numbers differ by 1.
The sequence does not need to appear consecutively in the original array.
If multiple sequences have the same maximum length, printing any one of them is acceptable.
Example 1

Input:
nums = [100, 4, 200, 1, 3, 2]
Output:
1 2 3 4
*/
package Array.ArrayImportantStriver;

import java.util.HashSet;

public class fPrintLongestConsecutiveSequence {

    public static void longestConsecutive(int[] nums) {

        // Store all unique numbers in a HashSet.
        // Why? Because HashSet provides O(1) average lookup time,
        // allowing us to quickly check if a number exists.
        HashSet<Integer> set = new HashSet<>(); 

        for (int num : nums) {
            set.add(num);
        }

        // Length of longest sequence
        int longestLength = 0;

        // Starting number of longest sequence
        int longestStart = 0;

        for (int num : set) {

            // Check if current number is start of sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update longest sequence details
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestStart = num;
                }
            }
        }

        System.out.println("Longest Sequence:");

        for (int i = 0; i < longestLength; i++) {
            System.out.print((longestStart + i) + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        longestConsecutive(nums);
    }
}
//Earlier we only stored: int longest = 0; Now we also store: int longestStart = 0;
//When a bigger sequence is found: we update longestStart with the num
/*
Time Complexity: O(N) because building the HashSet takes O(N), each element is processed at most once while finding consecutive sequences, and printing the longest sequence takes at most O(N). Overall complexity is O(N).
Space Complexity: O(N) because the HashSet stores up to N unique elements.
*/