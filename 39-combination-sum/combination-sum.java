class Solution {
    public List<List<Integer>> answer=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        func(0,target,new ArrayList<>(),candidates);
        return answer;
    }
    private void func(int i,int rem,List<Integer> combination,int[] candidates)
    {
        if(i==candidates.length)
        {
            if(rem==0){
                List<Integer> ans=new ArrayList<>();
                for(int num:combination){
                    ans.add(num);
                }
                answer.add(ans);
            }
        }
        else{
            int maxtimes=rem/candidates[i];
            for(int k=0;k<=maxtimes;k++)
            {
                int newTarget=rem-k*candidates[i];
                for(int j=0;j<k;j++)
                {
                    combination.add(candidates[i]);
                }
                func(i+1,newTarget,combination,candidates);
                for(int j=0;j<k;j++)
                {
                    combination.remove(combination.size()-1);
                }
            }
        }
    }
}