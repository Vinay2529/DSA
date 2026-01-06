class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, true);
        }
        int res = 0;

        for (int num : mp.keySet()) {
            if (mp.containsKey(num - 1)) {
                continue;
            }
            int nextnum = num + 1;
            int count = 1;
            while (mp.containsKey(nextnum)) {
                nextnum++;
                count++;
            }
            if (count > res) {
                res = count;
            }
        }
        return res;
    }
}