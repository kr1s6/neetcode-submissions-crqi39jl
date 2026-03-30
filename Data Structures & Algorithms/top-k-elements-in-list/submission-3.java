class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(int i=0; i < nums.length + 1; i++){
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            //gets value = 2 for [7,7] 
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] output = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0; i--){
            for(int value : freq[i]){
                    output[index++] = value;
                    if(index == k){
                        return output;
                }
            }
        }

        return output;
    }
}
