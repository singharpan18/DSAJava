package BinarySearch;
//Find the smallest element in rotated sorted array. [4,5,6,7,1,2,3] → answer = 1
public class gFindMinRotatedArray {

    public static int findMin(int[] arr) {

        int low = 0, high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // 🔹 Right side is unsorted → min is there
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }

            // 🔹 Left side includes minimum
            else {
                high = mid;
            }
        }

        return arr[low]; // or arr[high]
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 1, 2, 3};

        System.out.println(findMin(arr)); // Output: 1
    }
}