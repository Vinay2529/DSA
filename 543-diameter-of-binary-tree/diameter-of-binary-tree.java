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
        finddia(root);
        return diameter;
    }    
    private int finddia(TreeNode root)
    {
        if(root==null) return 0;
        int leftheight=finddia(root.left);
        int rightheight=finddia(root.right);

        int total=leftheight+rightheight;
        if(total>diameter){
            diameter=total;
        }
        return Math.max(leftheight,rightheight)+1;
    }
}