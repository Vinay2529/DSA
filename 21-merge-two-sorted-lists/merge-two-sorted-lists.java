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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headA=list1,headB=list2;
        ListNode head=null,tail=null;
        while(headA!=null || headB!=null)
        {
            ListNode nottocopy=null;
            if(headA!=null && headB!=null)
            {
                if(headA.val<headB.val)
                {
                    nottocopy=headA;
                    headA=headA.next;
                }
                else{
                    nottocopy=headB;
                    headB=headB.next;
                }
            }
            else if(headA!=null)
            {
                nottocopy=headA;
                headA=headA.next;
            }
            else if(headB!=null){
                nottocopy=headB;
                headB=headB.next;
            }
            tail=insert(tail,nottocopy.val);
            if(head==null)
            {
                head=tail;
            }
        }
        return head;
    }
    private ListNode insert(ListNode tail,int data)
    {
        ListNode nn=new ListNode(data,null);
        if(tail!=null)
        {
            tail.next=nn;
        }
        return nn;
    }
}