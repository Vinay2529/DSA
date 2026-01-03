class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!mp.containsKey(nums[i]))
            {
                mp.put(nums[i],1);
            }
            else{
                return true;
            }
        }

        
        return false;
    }
}