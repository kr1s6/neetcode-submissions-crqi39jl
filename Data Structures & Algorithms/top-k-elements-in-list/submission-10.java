class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0)+ 1);
        }

        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }

        arr.sort((a,b) -> b[0] - a[0]);

        return arr.stream().limit(k).mapToInt(entry -> entry[1]).toArray();

    }
}
