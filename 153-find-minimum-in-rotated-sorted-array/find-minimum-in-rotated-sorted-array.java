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
        if(count>0){
            return nums[count];
        }
        return nums[0];
    }
}