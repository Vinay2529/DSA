/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {  
    public Map<Node,Node> clonedGraph;
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        clonedGraph=new HashMap<>();
        return dfs(node);
    }
    private Node dfs(Node node){
        if(clonedGraph.containsKey(node)){
            return clonedGraph.get(node);
        }
        Node cloneNode=new Node(node.val);
        clonedGraph.put(node,cloneNode);

        for(Node neighbour :node.neighbors){
            cloneNode.neighbors.add(dfs(neighbour));
        }

        return cloneNode;
    }
}
