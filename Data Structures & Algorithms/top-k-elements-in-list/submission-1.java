class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num: nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(int num : count.keySet()){
            arr.add(new int[] {count.get(num), num});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] output = new int[k];
        for(int i=0; i <k; i++){
            output[i] = arr.get(i)[1];
        }

        return output;
    }
}
