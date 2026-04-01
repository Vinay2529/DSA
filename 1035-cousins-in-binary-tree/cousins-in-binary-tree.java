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
    public TreeNode parentX=null, parentY=null;
    public int depthX=-1,depthY=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        Cousins(root,null,0,x,y);
        return (depthX==depthY) && (parentX !=parentY);
    }
    private void Cousins(TreeNode node,TreeNode parent,int depth,int x,int y)
    {
        if(node==null) return ;
        
        if(node.val==x)
        {
            parentX=parent;
            depthX=depth;
        }
        if(node.val==y)
        {
            parentY=parent;
            depthY=depth;
        }

        Cousins(node.left,node,depth+1,x,y);
        Cousins(node.right,node,depth+1,x,y);
    }
}