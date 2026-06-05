class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[] nums=new int[m*n];
        int z=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[z++]=grid[i][j];
            }
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[2];
        for(int i=1;i<=nums.length;i++){
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