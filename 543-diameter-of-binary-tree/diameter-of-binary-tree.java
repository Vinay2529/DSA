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
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return diameter;
    }
    private int find(TreeNode root)
    {
        if(root==null) return 0;
        int leftside=find(root.left);
        int rightside=find(root.right);
        int total=leftside+rightside;
        if(total>diameter)
        {
            diameter=total;
        }
        return Math.max(leftside,rightside)+1;
    }
}