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
        ListNode p1 = head, p2 = head;
        HashSet<Integer> hs = new HashSet<>();
        while(p1 != null){
            int v = p1.val;
            if(hs.contains(v)){
                p2.next = p1.next;                
            }
            else{
                hs.add(v);
                p2 = p1;
            }
            p1 = p1.next;
        }
        return head;
    }
}
