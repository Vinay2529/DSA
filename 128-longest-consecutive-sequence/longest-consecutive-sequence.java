class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int num:nums)
        {
            st.add(num);
        }
        int longest=0;

        for(int num:st)
        {
            if(!st.contains(num-1))
            {
                int currentnum=num;
                int count=1;
                while(st.contains(currentnum+1))
                {
                    currentnum++;
                    count++;
                }
                if(count>longest)
                {
                    longest=count;
                }
            }
        }
        return longest;
    }
}