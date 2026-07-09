/*
Problem: Longest Consecutive Sequence
Problem Statement

Given an unsorted integer array nums, return the length of the longest consecutive elements sequence.
A consecutive sequence consists of numbers that follow each other with a difference of 1.
Your algorithm must run in O(n) time.

Example 1
Input
nums = [100, 4, 200, 1, 3, 2]
Output
4
*/
package Array.ArrayImportantStriver;

import java.util.HashSet;

public class fLongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        // Store all unique numbers in a HashSet.
        // Why? Because HashSet provides O(1) average lookup time,
        // allowing us to quickly check if a number exists.
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Stores maximum sequence length found
        int longest = 0;

        // Traverse every number
        for (int num : set) {

            // Check if current number is the start
            // of a consecutive sequence
            if (!set.contains(num - 1)) {

                // Current sequence starts from num
                int currentNum = num;

                // Current sequence length
                int currentLength = 1;

                // Keep checking next consecutive numbers
                while (set.contains(currentNum + 1)) {

                    currentNum++;

                    currentLength++;
                }

                // Update maximum length
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));
    }
}
/*
Time Complexity: O(N) because building the HashSet takes O(N), and each number is processed at most once while finding consecutive sequences. HashSet lookups (contains) are O(1) on average.
Space Complexity: O(N) because the HashSet stores up to N unique elements.

*/