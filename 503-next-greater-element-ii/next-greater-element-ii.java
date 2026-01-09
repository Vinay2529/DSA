class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(!st.isEmpty() && nums[st.peek()]<nums[i])
            {
                res[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && nums[st.peek()]<nums[i])
            {
                res[st.peek()]=nums[i];
                st.pop();
            }
        }
        while(!st.isEmpty())
        {
            res[st.peek()]=-1;
            st.pop();
        }
        return res;
    }
}