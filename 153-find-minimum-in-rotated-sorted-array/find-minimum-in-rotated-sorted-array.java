class Solution {
    public int findMin(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count = i+1;
                break;
            }
        }
        if (count > 0) {
            reverse(nums, 0, count-1);
            reverse(nums, count , n - 1);
            reverse(nums, 0, n - 1);
        }
        return nums[0];
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}