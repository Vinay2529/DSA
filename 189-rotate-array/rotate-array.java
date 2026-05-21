class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > 0 ) {
            int z = k % n;
            reverse(nums, 0, n - 1);
            reverse(nums, 0, z - 1);
            reverse(nums, z, n - 1);
        }
    }

    private void reverse(int[] nums, int s, int e) {
        while (s <= e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}