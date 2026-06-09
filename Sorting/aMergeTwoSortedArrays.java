package Sorting;

import java.util.Arrays;

public class aMergeTwoSortedArrays {

    public static int[] merge(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[n + m];

        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int k = 0; // pointer for merged array

        // Compare elements from both arrays
        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of arr1
        while (i < n) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2
        while (j < m) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] result = merge(arr1, arr2);

        System.out.println(Arrays.toString(result));
    }
}