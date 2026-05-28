package Array.ArrayVeryImportant;

import java.util.Arrays;

public class ffProductExceptSelf {

    public static int[] productExceptSelf(int[] arr) {

        int n = arr.length;

        int totalProduct = 1;

        for (int num : arr) {
            totalProduct *= num;
        }

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = totalProduct / arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}