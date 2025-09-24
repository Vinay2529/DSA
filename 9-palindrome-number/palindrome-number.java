class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int n=str.length();
        int l=0,r=n-1;
        while(l<r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;

    }
}