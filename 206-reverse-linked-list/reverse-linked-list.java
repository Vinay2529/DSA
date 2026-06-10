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
    private ListNode newNode;
    public ListNode reverseList(ListNode head) {
        if(head!=null){
            ListNode lastNode=recursive(head);
            lastNode.next=null;
            head=newNode;
        }
        return head;
    }
    private ListNode recursive(ListNode curr){
        if(curr.next==null){
            newNode=curr;
            return curr;
        }else{
            ListNode last=recursive(curr.next);
            last.next=curr;
            return curr;
        }
    }
}