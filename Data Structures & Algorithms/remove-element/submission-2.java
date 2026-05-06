class Solution {
    public int removeElement(int[] nums, int val) {
        int res = nums.length;
        int i = 0;
        while(i < res){
            if(nums[i] == val){
                nums[i] = nums[res-- - 1];
            } else {
                i++;
            }
        }

        return res;
    }
}