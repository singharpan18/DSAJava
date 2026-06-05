package BinarySearch;

public class bFirstOccurrence {

    public static int firstOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1; // store best answer

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;       // store result
                high = mid - 1;   // move left to find earlier occurrence
            }

            else if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 5, 6};
        System.out.println(firstOccurrence(arr, 4));
    }
}