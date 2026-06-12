package RecusrionBacktracking;

import java.util.Arrays;

public class aPermutations {

    public static void permute(int[] arr, int index) {

        // Base case
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Choose
            swap(arr, index, i);

            // Explore
            permute(arr, index + 1);

            // Backtrack
            swap(arr, index, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        permute(arr, 0);
    }
}