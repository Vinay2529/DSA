class Solution {
    public Set<List<Integer>> answer = new HashSet<>();
    public int[] nums;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        this.nums = nums;
        backtrack(new ArrayList<>(), 0);
        return new ArrayList<>(answer);
    }

    private void backtrack(List<Integer> subset, int i) {
        if(i==nums.length){
            answer.add(new ArrayList<>(subset));
        }
        else{
            backtrack(subset,i+1);
            subset.add(nums[i]);
            backtrack(subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}