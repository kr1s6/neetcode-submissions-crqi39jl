class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i < nums.length; i++)
      {
        int difValue = target - nums[i];
        if(map.containsKey(difValue))
        {
            return new int[] {map.get(difValue), i};
        }
        map.put(nums[i], i);
      }

      return new int[2];
    }
}
