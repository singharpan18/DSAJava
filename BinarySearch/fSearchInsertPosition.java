package BinarySearch;
/*
You are given a sorted array and a target value.
You need to:
Find the index of the target if it exists.
If it does NOT exist, return the index where it should be inserted so that the array remains sorted.
*/

public class fSearchInsertPosition {

    public static int searchInsert(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;       // possible insert position
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5)); // exists
        System.out.println(searchInsert(arr, 2)); // insert position
        System.out.println(searchInsert(arr, 7)); // insert at end
    }
}