class Solution {
    public List<List<Integer>> answer = new ArrayList<>();
    public int[] candidates;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates=candidates;
        backtrack(0,target,new ArrayList<>());
        return answer;
    }

    private void backtrack(int start, int target, List<Integer> combination) {
        if(target==0)
        {
            answer.add(new ArrayList<>(combination));
            return;
        }
        else{
            for(int i=start;i<candidates.length;i++)
            {
                if(i>start && candidates[i]==candidates[i-1])
                {
                    continue;
                }
                if(candidates[i]>target)
                {
                    break;
                }
                combination.add(candidates[i]);
                backtrack(i+1,target-candidates[i],combination);
                combination.remove(combination.size()-1);
            }
        }
    }
}