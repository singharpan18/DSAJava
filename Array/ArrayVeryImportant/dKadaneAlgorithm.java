package Array.ArrayVeryImportant;

public class dKadaneAlgorithm  {

    public static int maxSubArray(int[] arr) {

        // Current subarray sum
        int currentSum = arr[0];

        // Maximum sum found so far
        int maxSum = arr[0];

        // Traverse array
        for (int i = 1; i < arr.length; i++) {

            // Either start new subarray
            // or continue existing subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(arr);

        System.out.println("Maximum Subarray Sum: " + result);
    }

}
