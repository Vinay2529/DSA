class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        
        for(int num:nums){
            if(mp.containsKey(num)){
                return num;
            }
            mp.put(num,1);
        }
        return 0;
    }
}