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
    public List<Integer> answer;
    public int maxLevelSum(TreeNode root) {
        answer=new ArrayList<>();
        int h=height(root);
        for(int i=0;i<h;i++)
        {
            answer.add(0);
        }
        traverse(root,0);
        int maxSum=Integer.MIN_VALUE;
        int level=0;
        for(int i=0;i<answer.size();i++)
        {
            if(answer.get(i)>maxSum)
            {
                maxSum=answer.get(i);
                level=i+1;
            }
        }
        return level;
    }
    private int height(TreeNode root)
    {
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left,right)+1;
    }
    private void traverse(TreeNode root,int level)
    {
        if(root==null) return;
        
        answer.set(level, answer.get(level) + root.val);

        traverse(root.left,level+1);
        traverse(root.right,level+1);
    }
}