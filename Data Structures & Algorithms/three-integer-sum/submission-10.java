class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            count.put(nums[i], count.get(nums[i]) - 1);
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int k = i+1; k<nums.length; k++){
                count.put(nums[k], count.get(nums[k]) - 1);
                if(k > i+1 && nums[k] == nums[k-1]) continue;

                int temp = -(nums[i] + nums[k]);
                if(count.getOrDefault(temp, 0) > 0){
                    result.add(List.of(nums[i], nums[k], temp));
                }

            }

            for(int k = i+1; k<nums.length; k++){
                count.put(nums[k], count.get(nums[k]) + 1);
            }
        }

        return result;
    }
}