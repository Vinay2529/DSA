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
    List<Integer> li;
    public int kthSmallest(TreeNode root, int k) {
        li=new ArrayList<>();
        inorder(root);
        int ans=0;
        for(int i=0;i<li.size();i++)
        {
            if(i==k-1){
                ans=li.get(i);
                break;
            }
            ans=li.get(i);
        }
        return ans;
    }
    private void inorder(TreeNode node){
        if(node==null){
            return ;
        }
        inorder(node.left);
        li.add(node.val);
        inorder(node.right);
    }
}