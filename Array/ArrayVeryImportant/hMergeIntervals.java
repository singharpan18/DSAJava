package Array.ArrayVeryImportant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//no need currently of doing this

public class hMergeIntervals {

    public static int[][] merge(int[][] intervals) {

        // Sort intervals based on start value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Stores merged intervals
        List<int[]> result = new ArrayList<>();

        // Add first interval
        result.add(intervals[0]);

        // Traverse from second interval
        for (int i = 1; i < intervals.length; i++) {

            int[] last = result.get(result.size() - 1);
            int[] current = intervals[i];

            // If intervals overlap
            if (current[0] <= last[1]) {

                // Merge by updating end value
                last[1] = Math.max(last[1], current[1]);
            } else {

                // No overlap, add current interval
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}