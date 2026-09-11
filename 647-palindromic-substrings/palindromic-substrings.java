class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];

        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
            }
        }

        for(int length=3;length<=n;length++){
            for(int start=0;start+length-1<n;start++){
                int end=start+length-1;
                if(s.charAt(start)==s.charAt(end) && dp[start+1][end-1]==true){
                    dp[start][end]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dp[i][j]==true){
                    count++;
                }
            }
        }
        return count;
    }
}