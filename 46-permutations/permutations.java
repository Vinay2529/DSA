class Solution {
    public List<List<Integer>> answer;
    public int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        answer=new ArrayList<>();
        this.nums=nums;
        function(new ArrayList<>(),new HashMap<>(),0);   
        return answer;   
    }
    private void function(List<Integer> subset,Map<Integer,Boolean> used,int i)
    {
        if(i==nums.length)
        {
            answer.add(new ArrayList<>(subset));
        }
        else{
            for(int num:nums)
            {
                if(!used.containsKey(num) || used.get(num)==false)
                {
                    subset.add(num);
                    used.put(num,true);
                    function(subset,used,i+1);
                    subset.remove(subset.size()-1);
                    used.put(num,false);
                }
            }
        }
    }
}