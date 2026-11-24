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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        view(root,0,list);
        return list;
    }
    public void view(TreeNode node,int depth,List<Integer> list){
        if(node==null) return ;
        if(depth==list.size()) list.add(node.val);
        view(node.right,depth+1,list);
        view(node.left,depth+1,list);
    }
}