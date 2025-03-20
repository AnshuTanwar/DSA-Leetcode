package Easy.Array;

public class BuySellStock {
    static int maximumProfit(int[] prices) { // TC -> O(n) , SC -> O(1)
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < minPrice) { //check if today's price is less then minPrice
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;  //if price is more than minPrice then we can get some profit
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = maximumProfit(prices);
        System.out.println("Maximum profit is : " + ans);

    }
}
