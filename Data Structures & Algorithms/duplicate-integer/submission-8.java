class Solution {
    public boolean hasDuplicate(int[] nums) {
        long unique = Arrays.stream(nums).distinct().count();
        return (long)unique != nums.length;
    }
}