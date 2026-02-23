class Solution {
    public List<List<Integer>> answer = new ArrayList<>();
    public int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        backtrack(new ArrayList<>(), 0);
        return answer;
    }

    private void backtrack(List<Integer> subset, int start) {
        answer.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            backtrack(subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}