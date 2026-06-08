package BinarySearch;
/*
Koko loves bananas.
You are given:
piles = [3,6,7,11]
h = 8
piles[i] = bananas in the ith pile.
Koko chooses an eating speed k bananas/hour.
In one hour, she can eat at most k bananas from a single pile.
If a pile has fewer than k bananas, she eats the whole pile and waits for the next hour.
Return the minimum eating speed k so that Koko can finish all bananas within h hours.
*/
public class mKokoEatingBananas {

    public static boolean canEat(int[] piles,
                                 int h,
                                 int speed) {

        long totalHours = 0;

        for (int pile : piles) {

            totalHours += (pile + speed - 1) / speed;
        }

        return totalHours <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int answer = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {

                answer = mid;

                // Try smaller speed
                high = mid - 1;

            } else {

                // Need faster speed
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        System.out.println(minEatingSpeed(piles, h));
    }
}
/*
Example
Input
piles = [3,6,7,11]
h = 8
Output
4
Understanding the Question

Suppose:

k = 4 bananas/hour

Hours needed:

Pile = 3
3/4 = 0.75

Needs:

1 hour
Pile = 6
6/4 = 1.5

Needs:

2 hours
Pile = 7
7/4 = 1.75

Needs:

2 hours
Pile = 11
11/4 = 2.75

Needs:

3 hours

Total:

1 + 2 + 2 + 3 = 8 hours

Possible ✅
*/
