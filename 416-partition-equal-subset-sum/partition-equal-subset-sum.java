class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum%2!=0){
            return false;
        }
        int target = sum / 2;
        Boolean[][] dp = new Boolean[n][target + 1];
        return f(nums, target, 0, dp);
    }

    private Boolean f(int[] nums, int target, int i, Boolean[][] dp) {
        if (target < 0) {
            return false;
        } else if (dp[i][target] != null) {
            return dp[i][target];
        } else if (i == nums.length - 1) {
            if (target == 0 || target == nums[i]) {
                return true;
            } else {
                return false;
            }
        } else {
            boolean isPossible = f(nums, target - nums[i], i + 1, dp) || f(nums, target, i + 1, dp);
            dp[i][target] = isPossible;
            return isPossible;
        }
    }
}