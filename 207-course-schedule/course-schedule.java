class Solution {
    private List<List<Integer>> adj=new ArrayList<>();
    private Map<Integer,String> state=new HashMap<>();
    private boolean isCycleFound=false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
            state.put(i,"U");
        }
        for(int i=0;i<prerequisites.length;i++){
            int[] req=prerequisites[i];
            int fromNode=req[1];
            int toNode=req[0];
            adj.get(fromNode).add(toNode);
        }
        for(int i=0;i<numCourses;i++){
            if(state.get(i).equals("U")){
                dfs(i);
            }
            if(isCycleFound==true){
                return false;
            }
        }
        return !isCycleFound;
    }
    public void dfs(int node){
        if(state.get(node).equals("U")){
            state.put(node,"V");
            List<Integer> neighbour=adj.get(node);
            for(int nei:neighbour){
                if(isCycleFound) return;
                dfs(nei);
            }
            state.put(node,"P");
        }
        else if(state.get(node).equals("V")){
            isCycleFound=true;
        }
    }
}