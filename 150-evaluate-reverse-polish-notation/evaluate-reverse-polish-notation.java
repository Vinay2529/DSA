class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (isoperator(token)) {
                int second = st.pop();
                int first = st.pop();
                int result = evaluate(first, second, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    private boolean isoperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int evaluate(int f, int s, String token) {
        if (token.equals("+"))
            return f + s;
        else if (token.equals("-"))
            return f - s;
        else if (token.equals("*"))
            return f * s;
        else
            return f / s;
    }
}