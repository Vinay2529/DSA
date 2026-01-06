class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length-1;i++)
        {
            int target=-nums[i];
            int f=i+1;
            int l=nums.length-1;
            while(f<l)
            {
                int sum=nums[f]+nums[l];
                if(sum==target)
                {
                    st.add(Arrays.asList(nums[i],nums[f],nums[l]));
                    f++;
                    l--;
                }
                else if(sum<target)
                {
                    f++;
                }
                else{
                    l--;
                }
            }
        }
        return new ArrayList<>(st);
    }
}