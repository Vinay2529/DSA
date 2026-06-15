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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n = len(head);
        k %= n;
        if(k==0) return head;

        head=reverse(head);
        ListNode kth = head;
        for (int i = 1; i < k; i++) {
            kth = kth.next;
        }
        ListNode secondhead=kth.next;
        kth.next=null;

        ListNode firstPart=reverse(head);
        ListNode secondPart=reverse(secondhead);

        ListNode tail=firstPart;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=secondPart;

        return firstPart;        

    }

    private ListNode reverse(ListNode curr) {
        ListNode prev = null;
        ListNode dummy = curr;
        while (dummy != null) {
            ListNode next = dummy.next;
            dummy.next = prev;
            prev = dummy;
            dummy = next;
        }
        return prev;
    }

    private int len(ListNode curr) {
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}