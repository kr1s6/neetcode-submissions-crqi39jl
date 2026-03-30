class Solution {
    public int maxProfit(int[] p) {
        int max = 0;
        int l = 0;
        int r = 1;
        while(r < p.length){
            if(p[r] > p[l]){
                int profit = p[r] - p[l];
                max = Math.max(profit, max);
            } else {
                l = r;
            }
            r++;
        }

        return max;
    }
}
