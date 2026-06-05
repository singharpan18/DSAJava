package Array.ArrayImportantStriver;

import java.util.Arrays;

public class gNextPermutation {

    public static void nextPermutation(int[] arr) {

        int n = arr.length;

        // Step 1: Find breakpoint
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {

            // First element from right
            // which is smaller than next element
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no breakpoint found// array is in descending order      
        if (index == -1) {
        /*If after scanning from right to left index is still -1, the array is in descending order 
        (largest permutation), so there is no next greater permutation. We reverse the entire array to obtain 
        the smallest permutation (ascending order). */
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 2: Find next greater element
        for (int i = n - 1; i > index; i--) {

            // Find first greater element
            if (arr[i] > arr[index]) {

                // Swap
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;

                break;
            }
        }

        // Step 3: Reverse remaining part
        reverse(arr, index + 1, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        nextPermutation(arr);

        System.out.println(Arrays.toString(arr));
    }
}
/*
Visual Memory Trick
Think: 1 2 7 4 3 1
Step 1: Find first increasing pair from right. 2 < 7. Breakpoint = 2
Step 2: Find next greater element from right. 3 Swap. 1 3 7 4 2 1
Step 3: Reverse suffix.7 4 2 1 ↓ 1 2 4 7
Result: 1 3 1 2 4 7

*/