class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}