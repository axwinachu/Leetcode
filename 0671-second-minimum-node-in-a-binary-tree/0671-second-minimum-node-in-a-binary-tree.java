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
    TreeSet<Integer> set = new TreeSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        int first=set.first();
        Integer second=set.higher(first);
        return second!=null?second:-1;
        
        
    }
    void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        set.add(root.val);
        helper(root.right);
    }
}