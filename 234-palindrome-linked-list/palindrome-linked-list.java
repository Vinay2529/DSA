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
        ListNode prev=null;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        while(curr!=null)
        {
            ListNode newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }
        ListNode firsthalf=head;
        ListNode secondhalf=prev;
        while(secondhalf!=null)
        {
            if(firsthalf.val!=secondhalf.val)
            {
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;
    }
}