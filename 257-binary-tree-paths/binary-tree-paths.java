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
    static int cnt;
    public List<String> binaryTreePaths(TreeNode root) {
        //if(root==null) return 0;
        List<String> ans=new ArrayList <>();
        check(root,ans,"");
        return ans; 
    }
    public void check(TreeNode root,List<String> ans,String path){
        if(root==null) return ;
        if(root.left==null && root.right==null) {
                path+=root.val;
                ans.add(path);
                return;
        }
        check(root.left,ans,path+root.val+"->");
        check(root.right,ans,path+root.val+"->");
        
    }

}