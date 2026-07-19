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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode t=head;
        while(t.next!=null){
            ListNode q=t.next;
            if(t.val==q.val) t.next=q.next;
            else t=t.next;
        }
        return head;
    }
}