package BinarySearch;

public class aBasicBinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int low = 0;                  // start index
        int high = arr.length - 1;    // end index

        while (low <= high) {         // continue until search space exists

            int mid = low + (high - low) / 2;  
            // avoids overflow and finds middle index

            if (arr[mid] == target) {
                return mid; // found target
            }

            else if (arr[mid] < target) {
                low = mid + 1;  // search right half
            }

            else {
                high = mid - 1; // search left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        System.out.println(binarySearch(arr, target));
    }
}