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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null ||k<=0)return head;
        int i=0;
        int size=getSize(head);
        int t=k%size;
        while(i<t){
           ListNode temp=head;
           ListNode prev=null;
           while(temp.next!=null){
            prev=temp;
            temp=temp.next;
           }
           temp.next=head;
           head=temp;
           prev.next=null;
           i++;
        }
        return head;
    }
    int getSize(ListNode head){
        int i=0;
        ListNode temp=head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }
}