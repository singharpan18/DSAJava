package BinarySearch;
/*
You are given:
weights = [1,2,3,4,5,6,7,8,9,10]
days = 5
You have to ship packages in order.
Rules:
You must ship in given order (no rearranging)
Each day you load packages until capacity is full
Find the minimum ship capacity so that all packages are shipped within days
*/

public class nShipPackages {

    public static boolean canShip(int[] weights, int days, int capacity) {

        int dayCount = 1;
        int currentLoad = 0;

        for (int weight : weights) {

            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } else {
                dayCount++;
                currentLoad = weight;

                if (dayCount > days) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {

                answer = mid;
                high = mid - 1; // try smaller capacity

            } else {

                low = mid + 1; // need bigger capacity
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}
/*
Example Intuition
weights = [1,2,3,4,5,6,7,8,9,10]
days = 5
Try capacity = 15
Day 1
1+2+3+4+5 = 15
Day 2
6+7 = 13
Day 3
8+6? (not allowed, continue order)
8+7? (still order constraint)
Actually:
8+9 = 17 > 15
So split correctly:
Day3 = 8

Continue similarly...

Result → needs more than 5 days ❌

So capacity = 15 is NOT enough.

Try capacity = 20

Now it becomes possible in ≤ 5 days ✅

So answer is around this range.

Search Space
Minimum capacity

At least the heaviest package:

max(weights)

Because one package must fit.

Maximum capacity

All packages in one day:

sum(weights)
Binary Search Range
low = max(weights)
high = sum(weights)
*/