class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] pref = new int[len];
        int[] suff = new int[len];
        int[] res = new int[len];

        //nums [2, 3, 2, 4]
        //pref [1, 2, 6, 12]
        pref[0] = 1;
        suff[len-1] = 1;
        for(int i=1; i < len; i++){
            pref[i] = nums[i - 1] * pref[i - 1];
        }

        for(int i=len-2; i >= 0; i--){
            suff[i] = nums[i + 1] * suff[i + 1];
        }

        for(int i=0; i < len; i++){
            res[i] = pref[i] * suff[i];
        }
        return res;

    }
}  
