package BinarySearch;

public class jSquareRoot {

    public static int sqrt(int n) {

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            // Exact square root found
            if (square == n) {
                return mid;
            }

            // Mid can be answer
            if (square < n) {
                ans = mid;
                low = mid + 1;
            }

            // Need smaller value
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 28;

        System.out.println(sqrt(n));
    }
}