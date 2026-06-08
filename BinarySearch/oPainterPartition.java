package BinarySearch;
/*
You are given:
boards = [10, 20, 30, 40]
painters = 2
Rules:
Each painter paints continuous boards only
Time to paint 1 unit board = 1 unit time
We want to minimize the maximum time taken by any painter

Return the minimum possible time.
*/
public class oPainterPartition {

    public static boolean canPaint(int[] boards, int painters, int maxTime) {

        int painterCount = 1;
        int time = 0;

        for (int board : boards) {

            if (time + board <= maxTime) {
                time += board;
            } else {
                painterCount++;
                time = board;

                if (painterCount > painters) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int minTime(int[] boards, int painters) {

        int low = 0;
        int high = 0;

        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPaint(boards, painters, mid)) {

                answer = mid;
                high = mid - 1; // try smaller max time

            } else {

                low = mid + 1; // need more time
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] boards = {10, 20, 30, 40};
        int painters = 2;

        System.out.println(minTime(boards, painters));
    }
}/*
Example Understanding
boards = [10, 20, 30, 40]
painters = 2
Option 1

Painter 1:

10 + 20 + 30 = 60

Painter 2:

40

Max time = 60

Option 2

Painter 1:

10 + 20 = 30

Painter 2:

30 + 40 = 70

Max time = 70

Option 3 (Best)

Painter 1:

10 + 20 + 30 = 60

Painter 2:

40

Best answer = 60
*/
