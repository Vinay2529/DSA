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
    List<List<Integer>> answer;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum){
        answer=new ArrayList<>();
        func(root,targetSum,new ArrayList<>());
        return answer;
    }
    private void func(TreeNode root,int targetSum,List<Integer> path)
    {
        if(root==null) return ;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum)
        {
            answer.add(new ArrayList<>(path));
        }

        func(root.left,targetSum-root.val,path);
        func(root.right,targetSum-root.val,path);

        path.remove(path.size()-1);
    }
}