class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        int i=0;
        while(i<n)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
            i++;
        }
    }
}