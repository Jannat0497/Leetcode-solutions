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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list= new ArrayList<>();
        sum(root,targetSum,new ArrayList<>(),list);
        return list;
    }
    public void sum(TreeNode node,int target,List<Integer> res,List<List<Integer>> list){
        if(node==null) return ;
        res.add(node.val);
        if(target==node.val && node.left ==null && node.right==null) {
            list.add(new ArrayList<>(res));
        }
        sum(node.left,target-node.val,res,list);
        sum(node.right,target-node.val,res,list);
        res.remove(res.size()-1);
   
    }

}