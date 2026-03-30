class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            heap.add(new int[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] output = new int[k];
        for(int i=0; i < k; i++){
            output[i] = heap.poll()[1];
        }

        return output;
    }
}
