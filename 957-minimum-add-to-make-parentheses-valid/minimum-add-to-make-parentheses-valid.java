class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }
            }
            i++;
        }
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
    }
}
