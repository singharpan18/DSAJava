package RecusrionBacktracking;

import java.util.*;

public class cArraySubsets {

    public static void printSubsets(int[] arr, List<Integer> output, int index) {

        // Base case:
        // Reached beyond last index -> one subset formed
        if (index == arr.length) {
            System.out.println(output);
            return;
        }

        // Exclude current element: Means: don't take arr[index], jst increase it
        printSubsets(arr, output, index + 1);

        // Include current element Means: take arr[index]
        output.add(arr[index]);

        printSubsets(arr, output, index + 1);

        // Backtracking: Undo include before returning to parent
        output.remove(output.size() - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        List<Integer> output = new ArrayList<>();

        printSubsets(arr, output, 0);
    }
}
/*
                                      []
                           (decide for 1)
                          /              \
                 Exclude 1              Include 1
                    []                     [1]

              (decide for 2)         (decide for 2)
                 /      \               /        \
         Exclude 2    Include 2   Exclude 2   Include 2
            []           [2]         [1]        [1,2]

      (decide for 3) (decide for 3) (decide for 3) (decide for 3)
          /    \         /    \         /    \          /    \
      E3      I3     E3      I3     E3      I3      E3      I3
      []      [3]    [2]   [2,3]   [1]   [1,3]   [1,2] [1,2,3]
*/