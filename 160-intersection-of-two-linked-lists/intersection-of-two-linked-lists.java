/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ListA=headA,ListB=headB;
        int aLen=len(headA);
        int bLen=len(headB);
        if(aLen>bLen){
            while (aLen != bLen) {
                ListA=ListA.next;
                aLen--;
            }
        }
        else{
            while (aLen != bLen) {
                ListB=ListB.next;
                bLen--;
            }
        }
        while(ListA!=null && ListB!=null){
            if(ListA==ListB){
                return ListA;
            }
            ListA=ListA.next;
            ListB=ListB.next;
        }
        return null;
    }

    private int len(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}