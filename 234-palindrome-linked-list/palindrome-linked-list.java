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
        if(head==null || head.next==null)
        {
            return true;
        }
        int n=findlen(head);
        int reversepoint=n/2;

        if(n%2!=0)
        {
            reversepoint=(n/2)+1;
        }

        ListNode prev=findkthNode(head,reversepoint-1);
        ListNode reversepointNode=findkthNode(head,reversepoint);

        ListNode head2=reverse(prev,reversepointNode);
        ListNode first=head,second=head2;

        while(first!=null && second!=null)
        {
            if(first.val != second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    private int findlen(ListNode curr)
    {
        int len=0;
        while(curr!=null)
        {
            len++;
            curr=curr.next;
        }
        return len;
    }
    private ListNode findkthNode(ListNode head,int k)
    {
        ListNode curr=head;
        for(int cnt=0;cnt<k;cnt++)
        {
            curr=curr.next;
        }
        return curr;
    }
    private ListNode reverse(ListNode prev,ListNode reversepointNode)
    {
        ListNode first=reversepointNode;
        ListNode second=reversepointNode.next;
        while(first!=null && second !=null)
        {
            ListNode temp=second.next;
            second.next=first;
            first=second;
            second=temp;
        }
        prev.next.next=null;
        prev.next=first;

        return first;
    }
}