package BinarySearch;
/*
You are given the positions of stalls and k cows.
Place the cows in the stalls such that the minimum distance between any two cows is maximized.
Return that maximum possible minimum distance.
*/
import java.util.Arrays;

public class kAggressiveCows {

    public static boolean canPlace(int[] stalls, int cows, int distance) {

        int countCow = 1; // First cow placed
        int lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {

            // Place next cow if distance condition satisfied
            if (stalls[i] - lastPlaced >= distance) {

                countCow++;
                lastPlaced = stalls[i];

                // All cows placed
                if (countCow == cows) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int cows) {

        Arrays.sort(stalls);

        int low = 1;

        int high = stalls[stalls.length - 1] - stalls[0];

        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(stalls, cows, mid)) {

                answer = mid;      // possible answer
                low = mid + 1;     // try bigger distance

            } else {

                high = mid - 1;    // try smaller distance
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        System.out.println(aggressiveCows(stalls, cows));
    }
}
/*
Example
Stalls = [1, 2, 4, 8, 9]
Cows = 3

We have 3 cows to place in these 5 stalls.

Option 1

Place cows at:

1 2 4 8 9
C C C

Positions:

1, 2, 4

Distances between cows:

2 - 1 = 1
4 - 2 = 2

Minimum distance:

min(1, 2) = 1
Option 2

Place cows at:

1 2 4 8 9
C   C     C

Positions:

1, 4, 9

Distances:

4 - 1 = 3
9 - 4 = 5

Minimum distance:

min(3, 5) = 3
Option 3

Place cows at:

1 2 4 8 9
C     C C

Positions:

1, 8, 9

Distances:

8 - 1 = 7
9 - 8 = 1

Minimum distance:

min(7, 1) = 1
What are we maximizing?

For every arrangement:

Arrangement        Minimum Distance

1,2,4                    1
1,4,9                    3
1,8,9                    1
2,4,8                    2

Now choose the arrangement whose minimum distance is largest.

1,4,9  → minimum distance = 3

This is the best arrangement.

Answer:

3
*/