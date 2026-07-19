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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        List<Integer> li=new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        ListNode dummy =new ListNode(-1);
        ListNode tail=dummy;
        for(int i=0;i<li.size();i+=2){
            tail.next=new ListNode(li.get(i));
            tail=tail.next;
        }
        for(int i=1;i<li.size();i+=2){
            tail.next=new ListNode(li.get(i));
             tail=tail.next;
        }
        return dummy.next;
    }
    
}