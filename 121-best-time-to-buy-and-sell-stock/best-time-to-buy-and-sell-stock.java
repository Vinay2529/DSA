class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int max_profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - buy;
            if (prices[i] < buy) {
                buy = prices[i];
            }
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
        return max_profit;
    }
}