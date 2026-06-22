class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] outdegree=new int[n+1];
        int[] indegree=new int[n+1];
        for(int[] row:trust){
            outdegree[row[0]]++;
            indegree[row[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(outdegree[i]==0 && indegree[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}