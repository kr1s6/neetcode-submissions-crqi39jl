class Solution {
    public int maxProfit(int[] p) {
        int l = 0; //buy
        int r = 1; //sell
        int max = 0;
        while(r < p.length){
            if(p[r] >= p[l]){
                int profit = p[r] - p[l];
                max = Math.max(max, profit);
            } else{
                l = r;
            }
            r++;
        }

        return max;
    }
}
