/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode samepoint = null;
        ListNode start = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                samepoint = slow;
                break;
            }
        }
        while (start != samepoint) {
            start = start.next;
            samepoint = samepoint.next;
        }
        return start;
    }
}