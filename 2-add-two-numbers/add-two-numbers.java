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
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode newNode=new ListNode(0);
        ListNode tail=newNode;
        int carry=0;
        while(a!=null || b!=null)
        {
            int sum=carry;
            if(a!=null && b!=null){
                sum+=a.val+b.val;
                a=a.next;
                b=b.next;
            }
            else if(a!=null){
                sum+=a.val;
                a=a.next;
            }
            else if(b!=null){
                sum+=b.val;
                b=b.next;
            }
            carry=sum/10;
            tail.next=new ListNode(sum%10,null);
            tail=tail.next;
        }
        if(carry>0){
            tail.next=new ListNode(carry,null);
        }
        return newNode.next;
    }
}