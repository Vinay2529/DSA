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
        int x = findlen(head) - n;
        if (x == 0) {
            return head.next;
        }
        ListNode curr = head;
        while (x > 1) {
            curr = curr.next;
            x--;
        }
        curr.next = curr.next.next;

        return head;
    }

    private int findlen(ListNode curr) {
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}