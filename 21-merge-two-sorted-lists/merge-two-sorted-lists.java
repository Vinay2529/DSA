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
        ListNode fp=list1;
        ListNode sp=list2;
        ListNode list =new ListNode();
        ListNode curr=list;

        while(fp!=null && sp!=null)
        {
            if(fp.val<sp.val)
            {
                curr.next=fp;
                fp=fp.next;
                curr=curr.next;
            }
            else{
                curr.next=sp;
                sp=sp.next;
                curr=curr.next;
            }
        }
        if(fp==null)
        {
            curr.next=sp;
        }
        else{
            curr.next=fp;
        }
        return list.next;
    }
}