class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=new PriorityQueue<>(
            (a,b) -> a.getValue() - b.getValue()
        );

        for (Map.Entry<Integer,Integer> entry:mp.entrySet()) {
            minHeap.offer(entry);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] arr=new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            arr[i++]=minHeap.poll().getKey();
        }
        return arr;
    }
}