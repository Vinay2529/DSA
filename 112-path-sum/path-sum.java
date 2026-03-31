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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return func(root, 0, targetSum);
    }

    private boolean func(TreeNode root, int sum, int target) {
        if (root == null)
            return false;

        sum += root.val;

        if (root.left == null && root.right == null) {
            return sum == target;
        }

        return func(root.left, sum, target) ||
                func(root.right, sum, target);
    }
}