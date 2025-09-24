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
        int x=1;
        int z=length(head);
        ListNode curr=head;
        while(x<z-n)
        {
            curr=curr.next;
            x++;
        }
        if(z==n)
        {
            head=curr.next;
            return head;
        }
        if(curr!=null && curr.next!=null)
        {
            curr.next=curr.next.next;
            return head;
        }
        return null;
        
    }
    private int length(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
}