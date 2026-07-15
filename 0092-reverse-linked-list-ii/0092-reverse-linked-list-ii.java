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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;
        if(left==right)return head;
        ListNode prev=null;
        ListNode curr=head;

        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }

        
        ListNode p1=prev;
        ListNode p2=curr;
        ListNode next=curr.next;
        prev=null;
        for(int i=0;curr!=null && i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if (next != null) next = next.next;;
        }

        if(p1!=null){
            p1.next=prev;
        }else{
            head=prev;
        }
        if(curr!=null){
          p2.next=curr;
        }else{
            p2.next=null;
        }
        return head;
    }
}