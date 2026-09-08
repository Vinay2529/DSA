class Solution {
    private Map<Long, Integer> mp;

    public int integerReplacement(int n) {
        mp = new HashMap<>();
        return f((long) n);
    }

    private int f(long n) {
        if (mp.containsKey(n)) {
            return mp.get(n);
        }
        if (n == 1) {
            return 0;
        }
        int ans;
        if (n % 2 == 0) {
            ans = f(n / 2) + 1;
        } else {
            ans = Math.min(f(n + 1), f(n - 1)) + 1;
        }
        mp.put(n, ans);
        return ans;
    }
}