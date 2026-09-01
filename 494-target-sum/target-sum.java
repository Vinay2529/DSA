class Solution {
    Map<String,Integer> mp;
    public int findTargetSumWays(int[] nums, int target) {
        mp=new HashMap<>();
        return f(0,target,nums);
    }
    private int f(int i,int target,int[] nums){
        String key=i+"-"+target;
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        if(i<nums.length-1){
            mp.put(key,f(i+1,target-nums[i],nums)+f(i+1,target+nums[i],nums));
            return mp.get(key);
        }
        else{
            if(Math.abs(target)==Math.abs(nums[i])){
                if(nums[i]==0) return 2;
                else return 1;
            }
            else{
                return 0;
            }
        }
    }
}