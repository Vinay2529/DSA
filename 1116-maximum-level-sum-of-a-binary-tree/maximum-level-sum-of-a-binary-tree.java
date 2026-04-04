/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class pair{
        public int level;
        public TreeNode node;
        public pair(int level,TreeNode node){
            this.level=level;
            this.node=node;
        }
    }
    public int maxLevelSum(TreeNode root) {
        Map<Integer,Integer> mp=new HashMap<>();
        Queue<pair> queue=new LinkedList<>();

        queue.add(new pair(1,root));
        while(!queue.isEmpty()){
            pair top=queue.poll();
            if(!mp.containsKey(top.level)){
                mp.put(top.level,0);
            }
            mp.put(top.level,mp.get(top.level)+top.node.val);
            if(top.node.left!=null)
            {
                queue.add(new pair(top.level+1,top.node.left));
            }
            if(top.node.right!=null)
            {
                queue.add(new pair(top.level+1,top.node.right));
            }
        }
        int ans=1;
        for(Integer level:mp.keySet()){
            if(mp.get(level)>mp.get(ans)){
                ans=level;
            }
        }
        return ans;
    }
}