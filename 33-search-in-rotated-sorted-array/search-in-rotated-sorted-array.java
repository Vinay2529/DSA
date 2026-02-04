class Solution {
    public int search(int[] nums, int target) {
        int por = findpor(nums);

        if (por == 0 || target < nums[0]) {
            return binary(nums, por, nums.length - 1, target);
        } else {
            return binary(nums, 0, por - 1, target);
        }
    }

    private int binary(int[] nums, int start, int end, int key) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < key) {
                start=mid+1;
            } else if (nums[mid] > key) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int findpor(int[] nums) {
        int start = 0, end = nums.length - 1;
        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] < nums[0]) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}