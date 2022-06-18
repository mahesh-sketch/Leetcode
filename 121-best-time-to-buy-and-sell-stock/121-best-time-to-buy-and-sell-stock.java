class Solution {
    public int maxProfit(int[] prices) {
        int mincost = prices[0];
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            mincost = Math.min(mincost,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-mincost);
        }
        return maxprofit;
    }
}