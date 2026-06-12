package RecusrionBacktracking;

public class bStringPermutations {

    public static void permute(char[] arr, int index) {

        // Base case
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Choose
            swap(arr, index, i);

            // Explore
            permute(arr, index + 1);

            // Backtrack
            swap(arr, index, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        String str = "ABC";

        permute(str.toCharArray(), 0);
    }
}