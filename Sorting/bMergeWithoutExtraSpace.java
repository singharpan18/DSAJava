package Sorting;

import java.util.Arrays;

public class bMergeWithoutExtraSpace {

    public static void merge(long[] arr1, long[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int left = n - 1;
        int right = 0;

        // Swap larger elements of arr1 with smaller elements of arr2
        while (left >= 0 && right < m) {

            if (arr1[left] > arr2[right]) {

                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;

                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {

        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}