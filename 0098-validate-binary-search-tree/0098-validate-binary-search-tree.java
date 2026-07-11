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
    List<Integer> li =new ArrayList<>();
    void helper(TreeNode node){
        if(node==null){
            return;
        }
        helper(node.left);
        li.add(node.val);
        helper(node.right);
    }
    public boolean isValidBST(TreeNode root) {
        helper(root);
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)>=li.get(i+1)){
                return false;
            }
        }
        return true;
        
    }
}