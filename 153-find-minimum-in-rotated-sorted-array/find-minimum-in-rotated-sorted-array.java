class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<nums[0]){
                ans=nums[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}