package Array.ArrayImportantStriver;

import java.util.HashSet;

public class fLongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        // Store all numbers in HashSet
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