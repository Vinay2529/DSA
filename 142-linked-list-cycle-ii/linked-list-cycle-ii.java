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
        ListNode fast=iscyclic(head);
        if(fast!=null)
        {
            ListNode third=head;
            while(fast!=third)
            {
                fast=fast.next;
                third=third.next;
            }
            return third;
        }
        return null;
    }
    private ListNode iscyclic(ListNode head)
    {
        ListNode curr=head;
        ListNode fast=head,slow=head;
        if(curr==null || curr.next==null)
        {
            return null;
        }
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return fast;
            }
        }
        return null;
    }
}