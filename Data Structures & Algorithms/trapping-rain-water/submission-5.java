class Solution {
    public int trap(int[] h) {
        int res = 0;
        
        for(int i=1; i<h.length; i++){
            int leftMax = h[i];
            int rightMax = h[i];

            for(int l=0; l<i; l++){
                if(h[l] > leftMax){
                    leftMax = h[l];
                }
            }

            for(int r=i+1; r<h.length; r++){
                if(h[r] > rightMax){
                    rightMax = h[r];
                }
            }

            res += Math.min(leftMax, rightMax) - h[i];

        }

        return res;
    }
}
