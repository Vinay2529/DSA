class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
        }
        int max=0;
        for(int num:st)
        {
            if(!st.contains(num-1))
            {
                int nextnum=num+1;
                int count=1;
                while(st.contains(nextnum))
                {
                    nextnum++;
                    count++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}