class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int j=0;j<nums.length;j++)
        {
            mp.put(nums[j],j);
        }
        int[] arr=new int[2];
        for(int j=0;j<nums.length;j++)
        {
            int z=target-nums[j];
            if(mp.containsKey(z) && mp.get(z) != j)
            {
                arr[0]=j;
                arr[1]=mp.get(z);
            }
        }
        return arr;
    }
}