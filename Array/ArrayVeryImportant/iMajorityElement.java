package Array.ArrayVeryImportant;

public class iMajorityElement {

    public static int majorityElement(int[] arr) {

        int candidate = 0;
        int count = 0;

        // Find potential candidate
        for (int num : arr) {

            // Choose new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase or decrease count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(arr);

        System.out.println("Majority Element: " + result);
    }
}