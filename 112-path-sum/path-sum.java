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

    private boolean func(TreeNode root,int sumTillParent,int targetSum)
    {
        if(root==null) return false;
        else if(root.left==null && root.right==null)
        {
            int currSum=sumTillParent+root.val;
            if(currSum==targetSum) return true;
            else return false;
        }
        else{
            int currSum=root.val+sumTillParent;
            boolean result=false;
            if(root.left!=null)
            {
                result=result||func(root.left,currSum,targetSum);
            }
            if(root.right!=null)
            {
                result=result||func(root.right,currSum,targetSum);
            }
            return result;
        }
    }
}