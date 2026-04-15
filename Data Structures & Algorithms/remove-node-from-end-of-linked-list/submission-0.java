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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int k =0;
        while(temp != null){
            temp = temp.next;
            k++;
        }
        temp = head;
        int t =0;
        if(k-n == 0) {
            head = head.next;  
            return head;
        }
        while(t < k-n-1){
            temp = temp.next;
            t++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
