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
        int l = 0, r = li.size() - 1;
        while (l < r) {
            if (!li.get(l).equals(li.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}