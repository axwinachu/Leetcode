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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=getMid(head);
        ListNode right=reverse(mid);
        // mid.next=null;
        ListNode left=head;
        while(left!=null && right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
    ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    ListNode reverse(ListNode head){
        if(head==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        ListNode nexts=temp.next;
        while(temp!=null){
            temp.next=prev;
            prev=temp;
            temp=nexts;
            if(nexts!=null){
                nexts=nexts.next;
            }
        }
        return prev;
    }
}