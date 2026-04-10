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
    public int count=0;
    public int goodNodes(TreeNode root) {
       return preorder(root,-12000);
    }
    private int preorder(TreeNode node,int maxtillParent)
    {
        if(node!=null){
            if(node.val>=maxtillParent){
                count++;
            }
            int maxforMyChild=Math.max(node.val,maxtillParent);
            preorder(node.left,maxforMyChild);
            preorder(node.right,maxforMyChild);
        }
        return count;
    }
}