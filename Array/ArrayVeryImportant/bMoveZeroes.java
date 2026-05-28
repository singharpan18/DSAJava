package Array.ArrayVeryImportant;

import java.util.Arrays;

public class bMoveZeroes {

    public static void moveZeroes(int[] arr) {

        // Pointer for placing non-zero elements
        int index = 0;

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                arr[index] = arr[i];
                index++;
            }
        }

        // Step 2: Fill remaining positions with 0
        while (index < arr.length) {

            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}