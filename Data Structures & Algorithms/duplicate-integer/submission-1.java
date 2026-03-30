class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int j=0; j<nums.length-1; j++){
            for(int i=j+1; i<nums.length; i++){
                    if(nums[j] == nums[i]){
                        return true;
                    }
                }
        }
        return false;
    }
}