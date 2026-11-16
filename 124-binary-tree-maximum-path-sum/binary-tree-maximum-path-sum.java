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
    int mps=Integer.MIN_VALUE;
    private int pathSum(TreeNode node){
        if(node==null) return 0;
        int left=Math.max(0,pathSum(node.left));
        int right=Math.max(0,pathSum(node.right));
        int curr=left+right+node.val;
        mps=Math.max(mps,curr);
        return Math.max(left,right)+node.val;
    }
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return mps;
    }
}