class Solution {
    public List<List<Integer>> answer=new ArrayList<>();
    public int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        this.candidates=candidates;
        function(new ArrayList<>(),target,0);
        return answer;
    }
    private void function(List<Integer> subset,int rem,int i)
    {
        if(i==candidates.length)
        {
            if(rem==0)
            {
                answer.add(new ArrayList<>(subset));
                return;
            }
        }
        else{
            int max=rem/candidates[i];
            for(int k=0;k<=max;k++)
            {
                int newTarget=rem-k*candidates[i];
                for(int j=0;j<k;j++)
                {
                    subset.add(candidates[i]);
                }
                function(subset,newTarget,i+1);
                for(int j=0;j<k;j++)
                {
                    subset.remove(subset.size()-1);
                }
            }
        }
    }
}