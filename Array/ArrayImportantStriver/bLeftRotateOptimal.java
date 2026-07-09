/*
Problem: Left Rotate an Array by K Positions
Problem Statement

Given an integer array arr of size N and an integer k, rotate the array to the left by k positions.
Return (or print) the rotated array.

Example 1
Input:
arr = [1, 2, 3, 4, 5]
k = 2
Output:
[3, 4, 5, 1, 2]
*/
package Array.ArrayImportantStriver;

public class bLeftRotateOptimal {

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % arr.length;

        reverse(arr, 0, k - 1);//split array in two part, split index is k -> rotate first part -> rotate second -> rotate entire
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
/*
Time Complexity: O(N) because the array is reversed three times. The total work is O(k) + O(N-k) + O(N) = O(2N), which simplifies to O(N).
Space Complexity: O(1) because the rotation is performed in-place using only a constant amount of extra memory (a temporary variable for swapping).
*/