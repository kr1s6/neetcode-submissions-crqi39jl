class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsHashMap = new HashMap<>();
        int key = 0;
        for(int num : nums){
            numsHashMap.put(key++, num);
        }

        int i;
        int j;
        for(int x = 0; x < nums.length; x++){
            int dif = target - nums[x];
            i = x;
            if(numsHashMap.containsValue(dif)){
                for(int index: numsHashMap.keySet()){
                    if(numsHashMap.get(index) == dif && index != i){
                        j = index;
                        return new int[]{i, j};
                    }
                }

            }
        }
        return null;
    
    }
}
