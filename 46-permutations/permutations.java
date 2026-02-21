class Solution {
    public List<List<Integer>> answer;
    public int[] nums;

    public List<List<Integer>> permute(int[] nums) {
        answer = new ArrayList<>();
        this.nums = nums;
        boolean[] used = new boolean[nums.length];
        function(new ArrayList<>(), used);
        return answer;
    }

    private void function(List<Integer> subset, boolean[] used) {
        if (subset.size() == nums.length) {
            answer.add(new ArrayList<>(subset));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                subset.add(nums[i]);
                used[i] = true;

                function(subset, used);

                subset.remove(subset.size() - 1);
                used[i] = false;
            }
        }
    }
}