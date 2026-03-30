class Solution {
    public int maxArea(int[] h) {
        int max = 0;
        int l = 0;
        int r = h.length -1;
        while(l < r){
            int water = Math.min(h[l], h[r]) * (r-l);
            max = Math.max(water, max);
            if(h[r] <= h[l]){
                r--;
            } else {
                l++;
            }
        }

        return max;
    }
}
