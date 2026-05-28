package Array.ArrayVeryImportant;
import java.util.Arrays;

public class eSort012 {

    public static void sortColors(int[] arr) {

        // low -> for 0s
        int low = 0;

        // mid -> current element
        int mid = 0;

        // high -> for 2s
        int high = arr.length - 1;

        // Traverse until mid crosses high
        while (mid <= high) {

            // If element is 0
            if (arr[mid] == 0) {

                // Swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            // If element is 1
            else if (arr[mid] == 1) {

                mid++;
            }

            // If element is 2
            else {

                // Swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColors(arr);

        System.out.println(Arrays.toString(arr));
    }
}