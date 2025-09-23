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
        ListNode curr=head;
        int z=length(head);
        int x=z/2;
        if(x==0)
        {
            return curr;
        }
        while(x>1)
        {
            curr=curr.next;
            x--;
        }
        
        return curr.next;
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