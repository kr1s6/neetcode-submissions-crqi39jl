class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> noDuplicate = new HashSet<>();
        for(int num: nums){
            noDuplicate.add(num);
        }
        System.out.println(noDuplicate);
        return !(nums.length == noDuplicate.size());
    }
}   