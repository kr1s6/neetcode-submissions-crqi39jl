class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];   //+ 1 bo bez by utowryzło liste z max indexem 5 bo idzie od 0, a max elemetnów jest 6
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for(int i= buckets.length - 1; i > 0 && index < k; i--){
            for(int val : buckets[i]){
                res[index++] = val;
                if(index == k){
                    return res;
                }
            }
        }

        return res;
    }
}
