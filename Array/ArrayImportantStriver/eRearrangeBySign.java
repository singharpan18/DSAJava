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