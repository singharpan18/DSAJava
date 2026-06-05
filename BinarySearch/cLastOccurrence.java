package BinarySearch;

public class cLastOccurrence {

    public static int lastOccurrence(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1; // move right
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
        System.out.println(lastOccurrence(arr, 4));
    }
}