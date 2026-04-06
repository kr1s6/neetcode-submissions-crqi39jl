class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buy = prices[0];
        for(int sell : prices){
            buy = Math.min(buy, sell);
            res = Math.max(res, sell - buy);
        }

        return res;
    }
}
