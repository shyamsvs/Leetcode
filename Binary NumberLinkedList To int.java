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
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (node != null){
            arrayList.add(node.val);
            node = node.next;
        }
        int size = arrayList.size() - 1;
        int ans = 0;
        for (int val : arrayList){
            int temp = (int) (val * Math.pow(2, size--));
            ans += temp;
        }
        return ans;
    }
}
