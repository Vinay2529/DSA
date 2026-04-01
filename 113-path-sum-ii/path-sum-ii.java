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
    public List<List<Integer>> answer;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        answer=new ArrayList<>();
        function(root,targetSum,new ArrayList<>());
        return answer;
    }
    private void function(TreeNode root,int target,List<Integer> path)
    {
        if(root==null) return;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==target)
        {
            answer.add(new ArrayList<>(path));
        }
        function(root.left,target-root.val,path);
        function(root.right,target-root.val,path);

        path.remove(path.size()-1);
    }
}