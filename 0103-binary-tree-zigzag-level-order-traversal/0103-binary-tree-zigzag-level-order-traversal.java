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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deq=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        boolean rev=false;
        deq.addFirst(root);
        while(!deq.isEmpty()){
            int size=deq.size();
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(!rev){
                    TreeNode temp=deq.pollFirst();
                    if(temp!=null && temp.left!=null){
                        deq.addLast(temp.left);
                    }
                    if(temp!=null && temp.right!=null){
                        deq.addLast(temp.right);
                    }
                    curr.add(temp.val);
                    
                }else{
                    TreeNode temp=deq.pollLast();
                    if(temp!=null &&temp.right!=null){
                        deq.addFirst(temp.right);
                    }
                    if(temp!=null &&temp.left!=null){
                        deq.addFirst(temp.left);
                    }
                    
                    curr.add(temp.val);
                }
            }
            rev=!rev;
            res.add(curr);

        }
        return res;
    }
}