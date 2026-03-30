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
        dia(root);
        return diameter;
    }
    private int dia(TreeNode r1)
    {
        if(r1==null) return 0;

        int leftDepth=dia(r1.left);
        int rightDepth=dia(r1.right);

        int total=leftDepth+rightDepth;
        if(total>diameter){
            diameter=total;
        }
        return Math.max(leftDepth,rightDepth)+1;
    }    
}