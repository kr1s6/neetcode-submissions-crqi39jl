class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int l = 0;
        int countW = 0;
        int countB = 0;
        int minOper = k;
        for(int r = 0; r < blocks.length(); r++){
            if(r-l+1 > k){
                if(blocks.charAt(l++) == 'W'){
                    countW--;
                } else {
                    countB--;
                }
            }

            if(blocks.charAt(r) == 'W'){
                countW++;
            } else{
                countB++;
            }

            if(r-l+1 == k){
                minOper = Math.min(minOper, countW);
            }
        }

        return minOper;
    }
}