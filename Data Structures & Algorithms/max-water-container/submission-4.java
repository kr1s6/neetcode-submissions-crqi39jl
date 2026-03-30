class Solution {
    public int maxArea(int[] h) {
        
        int l = 0;
        int r = h.length - 1;
        int max = Math.min(h[l], h[r]) * (r-l);
        while(l < r){
            if(h[l] < h[r]){
                l++;
            } else if(h[l] > h[r]) {
                r--;
            } else {
                l++;
            }
            max = Math.max(Math.min(h[l], h[r]) * (r-l), max);
        }

        return max;
    }
}
