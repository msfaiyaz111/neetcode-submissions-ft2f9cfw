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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        int ans = 0;

        while (l1 != null || l2 != null || ans != 0) {
            if (l1 != null) { ans += l1.val; l1 = l1.next; }
            if (l2 != null) { ans += l2.val; l2 = l2.next; }

            temp.val = ans % 10;
            ans /= 10;

            if (l1 != null || l2 != null || ans != 0) {
                temp.next = new ListNode();
                temp = temp.next;
            }
        }

        return head;
    }
}