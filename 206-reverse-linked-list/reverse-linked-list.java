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
    private ListNode newhead;
    public ListNode reverseList(ListNode head) {
        if(head!=null)
        {
            ListNode last=reverse(head);
            last.next=null;
            head=newhead;
        }
        return head;
    }
    private ListNode reverse(ListNode curr)
    {
        if(curr.next==null)
        {
            newhead=curr;
            return curr;
        }
        else{
            ListNode last=reverse(curr.next);
            last.next=curr;
            return curr;
        }
    }
}