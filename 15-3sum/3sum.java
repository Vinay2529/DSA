class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            int target=-nums[i];
            int s=i+1;
            int l=nums.length-1;
            while(s<l)
            {
                int sum=nums[s]+nums[l];
                if(sum==target)
                {
                    st.add(Arrays.asList(nums[i],nums[s],nums[l]));
                    s++;
                    l--;
                }
                else if(sum<target)
                {
                    s++;
                }
                else{
                    l--;
                }
            }
        }
        return new ArrayList<>(st);
    }
}