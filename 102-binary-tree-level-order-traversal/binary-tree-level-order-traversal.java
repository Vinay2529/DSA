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
    public List<List<Integer>> levelOrder(TreeNode root) {
        answer=new ArrayList<>();
        int height=depth(root);

        // creating empth list for each level
        for(int i=0;i<height;i++)
        {
            answer.add(new ArrayList<>());
        }

        traverse(root,0);
        return answer;
    }
    private int depth(TreeNode root)
    {
        if(root==null) return 0;
        int l=depth(root.left);
        int r=depth(root.right);
        return Math.max(l,r)+1;
    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null) return ;
        answer.get(level).add(root.val);

        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}