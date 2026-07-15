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
    HashMap<Integer,Integer> map=new LinkedHashMap<>();
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        if(head==null){
            return null;
        }
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode dummy = new ListNode(0); 
        ListNode tail = dummy;
        ListNode tr = head;

        while (tr != null) {
            if (map.get(tr.val) == 1) {
                tail.next = new ListNode(tr.val); 
                tail = tail.next;
            }
            tr = tr.next; 
        }

        return dummy.next;
    }
}