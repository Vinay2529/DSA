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
    public ListNode middleNode(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        int n=findlen(head);
        int start=n/2;
        ListNode curr=head;
        int z=0;
        while(z<start)
        {
            curr=curr.next;
            z++;
        }
        return curr;
    }
    private int findlen(ListNode curr)
    {
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
}