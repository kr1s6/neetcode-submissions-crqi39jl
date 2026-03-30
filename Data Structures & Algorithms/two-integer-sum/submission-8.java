class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i < nums.length; i++)
      {
        int num = nums[i];
        int difValue = target - num;
        if(map.containsKey(difValue))
        {
            return new int[] {map.get(difValue), i};
        }
        map.put(num, i);
      }

      return new int[] {};
    }
}
