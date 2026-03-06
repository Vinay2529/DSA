class Solution {
    public List<List<Integer>> answer;
    public int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        answer=new ArrayList<>();
        function(new ArrayList<>(),0);
        return answer;
    }
    private void function(List<Integer> subset,int i){
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