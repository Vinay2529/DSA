class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length <= 1) {
            return false;
        }
        int sum = 0;
        int[] prefix = new int[nums.length + 1];
        Map<Integer, Integer> mp = new HashMap<>();
        prefix[0] = sum;
        for (int i = 1; i < prefix.length; i++) {
            sum += nums[i - 1];
            prefix[i] = sum;
        }
        for (int i = 0; i < prefix.length; i++) {
            int rem = prefix[i] % k;
            if (mp.containsKey(rem)) {
                if (i - mp.get(rem) >= 2) {
                    return true;
                }
            } else {
                mp.put(rem, i);
            }
        }
        return false;
    }
}