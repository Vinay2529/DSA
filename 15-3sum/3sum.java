class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int target=-nums[i];
            int first=i+1;
            int last=n-1;
            while(first<last){
                int sum=nums[first]+nums[last];
                if(target==sum){
                    st.add(Arrays.asList(nums[i],nums[first],nums[last]));
                    first++;
                    last--;
                }
                else if(sum<target){
                    first++;
                }
                else{
                    last--;
                }
            }            
        }
        return new ArrayList<>(st);
    }
}