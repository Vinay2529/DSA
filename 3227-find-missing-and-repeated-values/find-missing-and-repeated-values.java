class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        
        int[] arr=new int[2];

        for(int i=1;i<=n*n;i++){
            if(mp.getOrDefault(i,0)==2){
                arr[0]=i;
            }
            if(!mp.containsKey(i)){
                arr[1]=i;
            }
        }
        return arr;
    }
}