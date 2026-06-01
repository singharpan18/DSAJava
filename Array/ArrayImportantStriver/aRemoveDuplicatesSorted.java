package Array.ArrayImportantStriver;

import java.util.*;

// Remove Duplicates Variants
public class aRemoveDuplicatesSorted {

    // Remove duplicates by sorting first
    public static void removeDuplicatesArraySorted(int[] arr) {

        System.out.print(arr[0] + " ");

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    // Remove duplicates from unsorted array using Set
    public static void removeDuplicatesUnsorted(int[] arr) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }

    // Remove duplicates without using Set
    public static void removeDuplicatesWithoutSet(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Method 1: Remove Duplicates
        int[] arr = {1, 2, 2, 2, 3, 5};

        System.out.println("Remove Duplicates:");

        removeDuplicatesArraySorted(arr);

        // Method 2: Using LinkedHashSet
        int[] arr1 = {4, 2, 1, 2, 4, 5};

        System.out.println("Using LinkedHashSet:");

        removeDuplicatesUnsorted(arr1);

        // Method 3: Without Using Set
        int[] arr2 = {4, 2, 9, 2, 4, 5};

        System.out.println("Without Using Set:");

        removeDuplicatesWithoutSet(arr2);
    }
}
/* if array is not sorted, without using sort or set we have to use two for loops */