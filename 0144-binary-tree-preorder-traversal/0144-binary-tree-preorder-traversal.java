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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        li.add(root.val);
        List<Integer> left=preorderTraversal(root.left);
        left.addAll(preorderTraversal(root.right));
        li.addAll(left);
        return li;

    }
}