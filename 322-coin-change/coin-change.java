class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;

        for(int coin:coins){
            if(coin<=amount){
                dp[coin]=1;
            }
        }
        for(int x=1;x<=amount;x++){
            int ans=-1;
            for(int coin:coins){
                if(x<coin) continue;
                if(dp[x-coin]!=-1 &&(ans==-1 || dp[x-coin]+1<ans)){
                    ans=dp[x-coin]+1;
                }
            }
            dp[x]=ans;
        }
        return dp[amount];
    }
}