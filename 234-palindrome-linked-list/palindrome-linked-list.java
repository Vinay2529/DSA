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
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverse(slow);
        ListNode firstHalf=head;
        while(secondHalf!=null){
            if(secondHalf.val!=firstHalf.val){
                return false;
            }
            secondHalf=secondHalf.next;
            firstHalf=firstHalf.next;
        }
        return true;
    }

    private ListNode reverse(ListNode dummy) {
        ListNode prev = null;
        ListNode curr = dummy;
        while (curr != null) {
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
}