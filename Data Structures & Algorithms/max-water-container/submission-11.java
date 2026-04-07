class Solution {
    public int maxArea(int[] h) {
        int res = 0;
        int l = 0;
        int r = h.length - 1;
        while(l < r){
            res = Math.max((r-l) * Math.min(h[l] , h[r]), res);
            if(h[l] <= h[r]){
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
