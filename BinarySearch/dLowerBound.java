package BinarySearch;

public class dLowerBound {

    public static int lowerBound(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = arr.length; // default if not found

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;      // possible answer
                high = mid - 1; // try to find smaller index
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(lowerBound(arr, 6));
    }
}
/*
👉 Lower Bound = “first place where I can insert target without breaking order”
| Concept     | Condition | Meaning                            |
| ----------- | --------- | ---------------------------------- |
| Lower Bound | ≥ target  | First occurrence / insert position |
| Upper Bound | > target  | First element after target range   |

*/