class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(mp.get(nums[i])>1)
            {
                return true;
            }
        }
        return false;
    }
}