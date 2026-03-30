class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int size = nums.length;
        for(int i = 0; i<size; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i -1]){
                continue;
            }

            int left = i+1;
            int right = size-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }
                else if(sum > 0){
                    right--;
                }
                else if(sum == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                } 
            }
        }

        return result;
    }
}
