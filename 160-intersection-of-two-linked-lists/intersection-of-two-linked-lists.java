public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int x=getlen(headA);
        int y=getlen(headB);
        if(x<y)
        {
            while(y!=x)
            {
                headB=headB.next;
                y--;
            }
        }
        else{
            while(x!=y)
            {
                headA=headA.next;
                x--;
            }
        }
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    private int getlen(ListNode head)
    {
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        return count;
    }
}