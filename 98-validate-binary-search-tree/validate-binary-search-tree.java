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
    public List<Integer> li;
    public boolean isValidBST(TreeNode root) {
        li=new ArrayList<>();
        inorder(root);
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i+1) <= li.get(i)){
                return false;
            }
        }
        return true;
    }
    private void inorder(TreeNode root)
    {
        if(root!=null){
            inorder(root.left);
            li.add(root.val);
            inorder(root.right);
        }
    }
}