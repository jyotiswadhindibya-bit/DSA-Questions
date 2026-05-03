/*Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */






//Solution in java
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
import java.util.*;
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode(0,head);
        ListNode r=temp;
        ListNode l=temp;
        for(int i=0;i<n;i++) r=r.next;
        while(r.next!=null){
            r=r.next;
            l=l.next;
        }
        l.next=l.next.next;
        return temp.next;
    }
}