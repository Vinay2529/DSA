class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int ele=nums[i];
            while(nums[i]>=1 && nums[i]<=n && nums[ele-1]!=nums[i])
            {
                int temp=nums[i];
                nums[i]=nums[ele-1];
                nums[ele-1]=temp;
                ele=nums[i];
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;
    }
}