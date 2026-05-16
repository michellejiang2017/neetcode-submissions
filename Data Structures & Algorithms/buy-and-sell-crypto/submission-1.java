class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; 
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = prices[i];
            if (prices[i] < min) {
                min = prices[i];
            }
            int testprofit = max - min;
            if (testprofit > profit) {
                profit = testprofit;
            }
        }
        if (profit < 0) {
            return 0;
        } else {
            return profit; 
        }
    }
}
