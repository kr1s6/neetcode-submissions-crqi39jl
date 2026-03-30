class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> noDuplicate = new TreeSet<>();
        for(int num: nums){
            noDuplicate.add(num);
        }
        System.out.println(noDuplicate);
        return !(nums.length == noDuplicate.size());
    }
}   