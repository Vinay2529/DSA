class Solution {
    public boolean isPalindrome(String s) {
        List<Character> li = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                li.add(Character.toLowerCase(c));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : li) {
            sb.append(c);
        }
        String result = sb.toString();
        int n = result.length();
        int l=0,r=n-1;
        while(l<r)
        {
            if(result.charAt(l)!=result.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}