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
    public int goodNodes(TreeNode root) {
        return f(root,root.val);
    }
    private int f(TreeNode root,int maxSoFar){
        if(root==null) return 0;
        int count=0;

        if(root.val>=maxSoFar){
            maxSoFar=root.val;
            count++;
        }
        count+=f(root.left,maxSoFar);
        count+=f(root.right,maxSoFar);
        return count;
    }
}