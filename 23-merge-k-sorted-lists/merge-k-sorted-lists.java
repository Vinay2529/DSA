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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>(
            (a,b)->a.val-b.val
        );
        for(ListNode node:lists){
            if(node!=null){
                minHeap.offer(node);
            }
        }
        ListNode test=new ListNode(-1);
        ListNode curr=test;
        while(!minHeap.isEmpty()){
            ListNode minNode=minHeap.poll();
            curr.next=new ListNode(minNode.val);
            curr=curr.next;
            if(minNode.next!=null){
                minHeap.offer(minNode.next);
            }
        }
        return test.next;
    }
}