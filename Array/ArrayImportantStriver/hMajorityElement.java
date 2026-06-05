package Array.ArrayImportantStriver;

public class hMajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // Choose new candidate
            if (count == 0) {
                candidate = num;
            }

            // Same candidate
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
}