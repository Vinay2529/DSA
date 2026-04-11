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
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        visit(root, false);
        return sum;
    }
    private void visit(TreeNode root, boolean isleftChild) {
        if (root != null) {
            if (root.left == null && root.right == null && isleftChild) {
                sum += root.val;
            }
            visit(root.left, true);
            visit(root.right, false);
        }
    }
}