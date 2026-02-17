class Solution {
    public List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        function(0, target, new ArrayList<>(), candidates);
        return answer;
    }

    private void function(int start, int rem, List<Integer> combination, int[] candidates) {

        if (rem == 0) {
            answer.add(new ArrayList<>(combination));
        }

        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                if (candidates[i] > rem) {
                    break;
                }
                combination.add(candidates[i]);
                function(i + 1, rem - candidates[i], combination, candidates);
                combination.remove(combination.size() - 1);
            }
        }
    }
}