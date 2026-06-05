package Array.ArrayImportantStriver;

public class jMissingRepeatingHash {

    public static void main(String[] args) {

        int[] arr = {4,3,6,2,1,1};
        int n = arr.length;

        int[] freq = new int[n + 1];

        for (int num : arr) {
            freq[num]++;
        }

        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) {

            if (freq[i] == 0)
                missing = i;

            if (freq[i] == 2)
                repeating = i;
        }

        System.out.println("Repeating = " + repeating);
        System.out.println("Missing = " + missing);
    }
}