class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        return Math.max(maximum(nums,0,n-2),maximum(nums,1,n-1));
    }

    private int maximum(int[] nums, int start, int end) {
        int n = nums.length;
        int[] dp = new int[nums.length + 1];
        dp[end + 1] = 0;
        dp[end] = nums[end];

        for (int i = end - 1; i >= start; i--) {
            dp[i] = Math.max(dp[i + 1], dp[i + 2] + nums[i]);
        }
        return dp[start];
    }
}