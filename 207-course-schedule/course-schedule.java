class Solution {
    public List<List<Integer>> graph = new ArrayList<>();
    public boolean isCycleFound = false;
    public Map<Integer,Character> state=new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
            state.put(i,'U');
        }
        for(int[] arr:prerequisites){
            int fromNode=arr[1];
            int toNode=arr[0];
            graph.get(fromNode).add(toNode);
        }
        for(int i=0;i<numCourses;i++){
            if(state.get(i).equals('U')){
                dfs(i);
            }
            if(isCycleFound==true){
                return false;
            }
        }
        return !isCycleFound;
    }
    private void dfs(int i){
        if(state.get(i).equals('U')){
            state.put(i,'V');
            List<Integer> neighbour =graph.get(i);
            for(int num : neighbour){
                dfs(num);
            }
            state.put(i,'P');
        }
        else if(state.get(i).equals('V')){
            isCycleFound=true;
        }
    }
}