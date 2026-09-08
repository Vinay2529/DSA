class Solution {
    private Map<Long, Integer> mp;

    public int integerReplacement(int n) {
        mp = new HashMap<>();
        mp.put((long)1,0);
        return f((long) n);
    }

    private int f(long n) {
        if (mp.containsKey(n)) {
            return mp.get(n);
        }
        int ans=0;
        if (n % 2 == 0) {
            ans = f(n / 2) + 1;
        } else {
            ans = Math.min(f(n + 1), f(n - 1)) + 1;
        }
        mp.put(n, ans);
        return ans;
    }
}