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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp!=null)curr.add(temp.val);
                if(temp!=null && temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp!=null && temp.right!=null){
                    q.offer(temp.right);
                }
            }
            res.add(curr);
        }
        return res;
    }
}