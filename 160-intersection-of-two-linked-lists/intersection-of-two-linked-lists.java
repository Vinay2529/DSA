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
        //find intersection OF TWO NODES
        ListNode fp = headA;
        ListNode sp = headB;
        int m = length(headA);
        int n = length(headB);
        if (m < n) {
            while (m != n) {
                sp = sp.next;
                n--;
            }
        } else {
            while (m != n) {
                fp = fp.next;
                m--;
            }

        }
        return Intersect(fp, sp);
    }

    private int length(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    private ListNode Intersect(ListNode fp, ListNode sp) {
        while (fp != null || sp != null) {
            if (fp == sp) {
                return fp;
            } else {
                fp = fp.next;
                sp = sp.next;
            }
        }
        return null;
    }
}