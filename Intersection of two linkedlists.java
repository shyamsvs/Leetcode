/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1Header = headA;
        ListNode p2Helper;
        while(p1Header != null){
            p2Helper = headB;
            while(p2Helper != null){
                if(p1Header == p2Helper){
                    return p1Header;
                }
                p2Helper = p2Helper.next;
            }
            p1Header = p1Header.next;
        }
        return null;
    }
}
