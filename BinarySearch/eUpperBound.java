package BinarySearch;
/*
👉 Index of the first element that is strictly greater than the target
*/
public class eUpperBound {

    public static int upperBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 7, 9};
        System.out.println(upperBound(arr, 7));
    }
}