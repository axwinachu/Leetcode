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
    public boolean isSymmetric(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int size=q.size();
            Deque<Integer> deq=new LinkedList<>();
            for(int i=0;i<size;i++){
               TreeNode curr=q.poll();
               if(curr.left!=null){
                    q.offer(curr.left);
                    deq.offer(curr.left.val);
               }else{
                deq.offer(-11);
               }
               if(curr.right!=null){
                    q.offer(curr.right);
                    deq.offer(curr.right.val);
               }else{
                deq.offer(-11);
               }
            }
            if(deq.size()%2==0){
               while(!deq.isEmpty()){
                    if(deq.pollFirst()!=deq.pollLast()){
                        return false;
                    }
               }
            }else{
                return false;
            }
           
        }
    return true;

    }
}