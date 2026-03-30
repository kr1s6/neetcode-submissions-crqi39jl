class Solution {
    public int maxProfit(int[] pr) {
        int max = 0;
        int buy = pr[0];
        for(int sell : pr){
            max = Math.max(max, sell - buy);
            buy = Math.min(buy, sell);
        }

        return max;

    }
}
