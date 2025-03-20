package Medium.Array;

public class Buy_SellStockII {
    static int maximumProfit(int[] prices) { // TC -> O(n), SC -> O(1)
        int maxProfit = 0;
        for(int i=0; i<prices.length-1; i++) {
            if(prices[i] < prices[i+1]) { 
                maxProfit += prices[i+1] - prices[i];
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
