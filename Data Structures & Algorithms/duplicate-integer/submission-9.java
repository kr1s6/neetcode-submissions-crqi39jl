class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != (long) nums.length;
    }
}