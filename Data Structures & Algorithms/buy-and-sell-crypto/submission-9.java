class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int l = 0; //buy
        int r = 1; //sell
        while(r < prices.length){
            int profit = prices[r] - prices[l];
            max = Math.max(max, profit);
            if(prices[r] < prices[l]){
                l = r;
                r++;
            } else {
                r++;
            }
        }

        return max;

    }
}
