class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        
        
        for(int j=0;j<nums.length;j++)
        {
            int z=target-nums[j];
            if(mp.containsKey(z) && mp.get(z) != j)
            {
                return new int[]{j,mp.get(z)};
            }
            else{
                mp.put(nums[j],j);
            }
        }
        return new int[0];
    }
}