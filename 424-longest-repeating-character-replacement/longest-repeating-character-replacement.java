class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] count=new int[26];

        int maxcount=0;
        int maxlength=0;
        int start=0;

        for(int end=0;end<n;end++)
        {
            maxcount=Math.max(maxcount,++count[s.charAt(end)-'A']);
            while(end-start+1-maxcount>k)
            {
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxlength=Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}