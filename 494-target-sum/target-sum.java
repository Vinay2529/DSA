class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return f(0,target,nums);
    }
    public int f(int i,int target,int[] nums){
        if(i<nums.length-1){
            return f(i+1,target-nums[i],nums)+f(i+1,target+nums[i],nums);
        }
        else{
            if(Math.abs(target)==Math.abs(nums[i])){
                if(nums[i]==0){
                    return 2;
                }
                else{
                    return 1;
                }
            }
            else{
                return 0;
            }
        }
    }
}