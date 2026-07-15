/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        return helper(li,0,li.size());
        
    }
    TreeNode helper(List<Integer> li,int st,int end){
        if(st>=end){
            return null;
        }
        int mid=st+(end-st)/2;
        TreeNode node=new TreeNode(li.get(mid));
        node.left=helper(li,st,mid);
        node.right=helper(li,mid+1,end);
        return node;
    }

}