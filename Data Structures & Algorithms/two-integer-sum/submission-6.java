class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for(int i=0; i < nums.length; i++){
        map.put(nums[i], i);
      }

      for(int i = 0; i < nums.length; i++){
        int difValue = target - nums[i];
        
        if(map.containsKey(difValue)){
            int index = map.get(difValue);
            if(i == index){
                continue;
            }
            return new int[] {i, index};
        }
      }

      return new int[0];
    }
}
