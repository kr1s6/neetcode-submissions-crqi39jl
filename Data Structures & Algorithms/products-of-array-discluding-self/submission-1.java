class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int product = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j != i){
                    product = product * nums[j];
                }
            }
            output[i] = product;
            product = 1;
        }

        return output;
    }
}  
