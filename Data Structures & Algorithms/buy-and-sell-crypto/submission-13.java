class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        int l = prices[0];
        for(int sell : prices){
            l = Math.min(l, sell);
            res = Math.max(res, sell - l);
        }

        return res;
    }
}
