package BinarySearch;

public class iFindPeakElement {

    public static int findPeakElement(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Increasing slope
            if (arr[mid] < arr[mid + 1]) {

                // Peak lies on right side
                low = mid + 1;

            } else {

                // Peak lies on left side including mid
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 12, 4, 2};

        int index = findPeakElement(arr);

        System.out.println("Peak Index = " + index);
        System.out.println("Peak Value = " + arr[index]);
    }
}