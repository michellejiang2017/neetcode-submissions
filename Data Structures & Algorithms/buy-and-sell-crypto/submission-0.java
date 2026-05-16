class Solution {
    public int maxProfit(int[] prices) {
        // find min of prices 
        // then find max of prices that's after min of prices
        int profit = 0; 
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int testprofit = prices[j]-prices[i];
                if (testprofit > profit) {
                    profit = testprofit;
                }
            }
        }
        if (profit < 0) {
            return 0;
        } else {
            return profit; 
        }
    }
}
