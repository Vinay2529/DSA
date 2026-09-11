class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        dp[m-1][n-1]=1;
        return f(m,n,0,0,dp);

    }
    private int f(int m,int n,int i,int j,int[][] dp){
        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }else
        {
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            else{
                dp[i][j]=f(m,n,i+1,j,dp) +f(m,n,i,j+1,dp);
            }
            return dp[i][j];
        }
    }
}