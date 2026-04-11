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
    public int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        depth(root);
        return maxsum;
    }
    private int depth(TreeNode node){
        if(node==null)
        {
            return 0;
        }
        int leftdepth=Math.max(0,depth(node.left));
        int rightdepth=Math.max(0,depth(node.right));
        int total=leftdepth+rightdepth+node.val;
        if(total>maxsum){
            maxsum=total;
        }
        return Math.max(leftdepth,rightdepth)+node.val;
    }
}