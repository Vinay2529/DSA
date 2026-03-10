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
       maxdepth(root);
       return diameter;        
    }
    private int maxdepth(TreeNode r1)
    {
        if(r1==null)return 0;
        int leftHeight=maxdepth(r1.left);
        int rightHeight=maxdepth(r1.right);

        diameter=Math.max(diameter,leftHeight+rightHeight);

        return Math.max(leftHeight,rightHeight)+1;
    }
}