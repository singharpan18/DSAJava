package Array.ArrayImportantStriver;

import java.util.HashSet;

public class fPrintLongestConsecutiveSequence {

    public static void longestConsecutive(int[] nums) {

        // Store all numbers in HashSet
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