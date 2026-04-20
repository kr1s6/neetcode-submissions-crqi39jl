class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;
        int res = 0;
        while(l <= r){
            int mid = l + (r-l) / 2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]){
                r = mid - 1;
                res = mid;
            } else {
                l = mid + 1;
                res = mid + 1;
            }
        }

        return res;

    }
}