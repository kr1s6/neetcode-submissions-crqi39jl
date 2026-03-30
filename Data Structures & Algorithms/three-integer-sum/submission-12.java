class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            while(left < right){
                int temp = nums[i] + nums[left] + nums[right];
                if(temp == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left - 1]){
                        left++;
                    }
                } else if(temp < 0){
                    left++;
                } else if(temp >0){
                    right--;
                }
            }
        }

        return result;
    }
}
