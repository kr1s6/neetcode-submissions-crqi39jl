class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int max = 1;
        Arrays.sort(nums);

        int j = 1;
        for(int i=1; i<nums.length; i++){
           if(nums[i] == nums[i - 1] + 1)
           {
            j++;
           } 
           else if(nums[i] == nums[i - 1]){
            continue;
           }
           else {
            if(j > max){
                max = j;
            }
            j = 1;
           }
        }

        if(j > max){
            max = j;
        }
        
        return max;
        
    }
}
