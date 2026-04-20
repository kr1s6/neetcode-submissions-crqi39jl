class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int res = 0;
        for(int sell : prices){
            res = Math.max(res, sell - buy);
            buy = Math.min(buy, sell);
        }

        return res;
    }
}
