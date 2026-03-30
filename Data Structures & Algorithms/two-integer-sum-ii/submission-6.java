class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int i=0; i < numbers.length; i++){
            int tmp = target - numbers[i];
            if(count.containsKey(tmp)){
                return new int[]{count.get(tmp) + 1, i + 1};
            }
            count.put(numbers[i], i);
        } 
        return new int[]{};
    }
}
