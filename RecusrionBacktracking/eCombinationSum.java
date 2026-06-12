package RecusrionBacktracking;

import java.util.*;

public class eCombinationSum {

    public static void combinationSum(int[] arr,
            int index,
            int target,
            List<Integer> current,
            List<List<Integer>> result) {

        // Base Case
        if (index == arr.length) {

            if (target == 0) {
                result.add(new ArrayList<>(current));
            }

            return;
        }

        // Pick
        if (arr[index] <= target) {

            current.add(arr[index]);

            combinationSum(arr,
                    index, // same index
                    target - arr[index],
                    current,
                    result);

            current.remove(current.size() - 1); // backtrack
        }

        // Not Pick
        combinationSum(arr,
                index + 1,
                target,
                current,
                result);
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        combinationSum(arr, 0, target,
                new ArrayList<>(),
                result);

        System.out.println(result);
    }
}