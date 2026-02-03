class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums,target);
        if(first==-1) return new int[]{-1,-1};
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
    private int findfirst(int[] nums,int target)
    {
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    private int findlast(int[] nums,int target)
    {
        int start=0,end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
    }
}