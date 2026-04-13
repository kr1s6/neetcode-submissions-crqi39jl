class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int temp = l;
        while(l <= r){
            int mid = l + (r-l) / 2;
            if(nums[mid] > target){
                temp = mid;
                r = mid - 1;
            } else if (nums[mid] < target){
                temp = mid + 1;
                l = mid + 1;
            } else {
                return mid;
            }

        }

        return temp;
    }
}