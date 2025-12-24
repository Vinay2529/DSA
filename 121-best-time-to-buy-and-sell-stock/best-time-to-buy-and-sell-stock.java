class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int res=0;
        int profit=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            profit=prices[i]-buy;
            if(profit>res)
            {
                res=profit;
            }
        }
        return res;
    }
}