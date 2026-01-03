class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault((nums[i]),0)+1);
        }

        for(Integer value : mp.values())
        {
            if(value>1)
            {
                return true;
            }
        }
        return false;
    }
}