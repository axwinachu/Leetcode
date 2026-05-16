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
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp!=null && temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp!=null && temp.right!=null){
                    q.offer(temp.right);
                }
                if(i==size-1){
                    res.add(temp.val);
                }
            }
        }
        return res;

    }
}