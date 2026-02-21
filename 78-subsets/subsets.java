class Solution {
    public List<List<Integer>> answer;
    public int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        answer=new ArrayList<>();
        this.nums=nums;
        function(new ArrayList<>(),0);
        return answer;
    }
    private void function(List<Integer> subset,int i)
    {
        if(i==nums.length)
        {
            answer.add(new ArrayList<>(subset));
        }
        else{
            function(subset,i+1);
            subset.add(nums[i]);
            function(subset,i+1);
            subset.remove(subset.size()-1);
        }
    }
}