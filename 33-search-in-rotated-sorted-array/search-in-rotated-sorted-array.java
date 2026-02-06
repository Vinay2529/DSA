class Solution {
    public int search(int[] nums, int target) {
        int por=pointOfRotation(nums);
        if(por==0 || target<nums[0])
        {
            return binarySearch(nums,por,nums.length-1,target);
        }
        else{
            return binarySearch(nums,0,por-1,target);
        }
    }
    private int binarySearch(int[] nums,int start,int end,int key)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]<key)
            {
                start=mid+1;
            }
            else if(nums[mid]>key)
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    private int pointOfRotation(int[] nums)
    {
        int ans=0;
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<nums[0])
            {
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}