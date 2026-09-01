class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int coin:coins){
            if(coin<=amount){
                dp[coin]=1;
            }
        }
        for(int i=1;i<=amount;i++){
            int ans=-1;
            for(int coin:coins){
                if(i<coin)continue;
                if(dp[i-coin]!=-1 && (ans==-1 || dp[i-coin]+1<ans)){
                    ans=dp[i-coin]+1;
                }
            }
            dp[i]=ans;
        }
        return dp[amount];
    }
}