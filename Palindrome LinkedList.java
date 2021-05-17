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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode node = head;
        while (node != null){
            arrayList.add(node.val);
            node = node.next;
        }
        int left = 0;
        int right = arrayList.size() - 1;
        while (left <= right){
            if(!arrayList.get(left).equals(arrayList.get(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
