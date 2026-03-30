class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> diffMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int stValue = target - nums[i];
            if(diffMap.containsKey(stValue)){
                return new int[] { diffMap.get(stValue), i};
            }

            diffMap.put(nums[i], i);
        }  
             
        return new int[]{};
    }
}
