package Array.ArrayVeryImportant;

public class jBestTimeToBuySellStock {

    public static int maxProfit(int[] prices) {

        // Minimum buying price so far
        int minPrice = Integer.MAX_VALUE;

        // Maximum profit
        int maxProfit = 0;

        // Traverse array
        for (int price : prices) {

            // Update minimum buying price
            if (price < minPrice) {

                minPrice = price;
            }

            // Calculate current profit
            int profit = price - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {

                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}