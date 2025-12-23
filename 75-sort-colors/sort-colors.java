class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int max = maximum(nums, n);

        int[] temp = new int[max + 1];

        for (int i = 0; i < n; i++) {
            temp[nums[i]]++;
        }

        for (int i = 1; i < temp.length; i++) {
            temp[i] = temp[i] + temp[i - 1];
        }

        int[] count = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int pos = temp[nums[i]] - 1;
            count[pos] = nums[i];
            temp[nums[i]]--;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = count[i];
        }
    }

    private int maximum(int[] nums, int n) {
        int a = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > a) {
                a = nums[i];
            }
        }
        return a;
    }
}