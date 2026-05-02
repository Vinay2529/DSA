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
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];

            while(temp != null) {
                minHeap.offer(temp.val);
                temp = temp.next;
            }
        }
        ListNode test=new ListNode(-1);
        ListNode current=test;
        while(!minHeap.isEmpty()){
            int val=minHeap.poll();
            current.next=new ListNode(val);
            current=current.next;
        }
        return test.next;
    }
}