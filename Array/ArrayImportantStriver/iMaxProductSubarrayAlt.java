package Array.ArrayImportantStriver;

public class iMaxProductSubarrayAlt {

    public static int maxProduct(int[] arr) {

        int n = arr.length;

        int left = 1, right = 1;
        int result = arr[0];

        for (int i = 0; i < n; i++) {

            left = (left == 0 ? 1 : left) * arr[i];

            right = (right == 0 ? 1 : right) * arr[n - 1 - i];

            result = Math.max(result,
                    Math.max(left, right));
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, -2, 4};

        System.out.println(maxProduct(arr));
    }
}