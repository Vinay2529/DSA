class Solution {
    public List<List<Integer>> answer=new ArrayList<>();
    public int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        this.candidates=candidates;
        backtrack(0,target,new ArrayList<>());
        return answer;
    }
    private void backtrack(int i,int rem,List<Integer> combination)
    {
        if(i==candidates.length)
        {
            if(rem==0)
            {
                answer.add(new ArrayList<>(combination));
                return;
            }
        }
        else{
            int maxtimes=rem/candidates[i];
            for(int k=0;k<=maxtimes;k++)
            {
                for(int j=0;j<k;j++)
                {
                    combination.add(candidates[i]);
                }
                backtrack(i+1,rem-k*candidates[i],combination);
                for(int j=0;j<k;j++)
                {
                    combination.remove(combination.size()-1);
                }
            }
        }
    }
}