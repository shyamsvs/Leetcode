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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next1,current = head;
        while(current != null){
            next1 = current.next;
            current.next = previous;
            previous = current;
            current = next1;
        }
        head = previous;
        return head;
    }
}
