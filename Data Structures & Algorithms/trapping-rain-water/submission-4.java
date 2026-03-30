class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int res = 0;

        for(int i=0; i<n; i++){

            int leftMax = h[i];
            int rightMax = h[i];
            for(int l=0; l<i; l++){
                leftMax = Math.max(leftMax, h[l]);
            }

            
            for(int r=i+1; r<n; r++){
                rightMax = Math.max(rightMax, h[r]);
            }

            res += Math.min(leftMax, rightMax) - h[i];
        }

        return res;
    }
}
