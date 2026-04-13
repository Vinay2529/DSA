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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
    private boolean isValid(TreeNode root,Integer lower,Integer upper)
    {
        if(root==null){
            return true;
        }
        if((lower!=null && root.val<=lower) || (upper!=null && root.val>=upper)){
            return false;
        }
        return isValid(root.left,lower,root.val) && isValid(root.right,root.val,upper);
    }
}