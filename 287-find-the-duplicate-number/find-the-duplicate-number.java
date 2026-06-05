class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i=1;i<nums.length;i++){
            if(mp.getOrDefault(i,0)>=2){
                return i;
            }
        }
        return 0;
    }
}