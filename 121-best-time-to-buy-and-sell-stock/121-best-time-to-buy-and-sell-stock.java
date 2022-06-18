class Solution {
    public int maxProfit(int[] prices) {
        int mincost = prices[0];
        int maxprofit = 0;
        for(int i =0;i<prices.length;i++){
            mincost = Math.min(mincost,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-mincost);
        }
        return maxprofit;
        // int maxprofit= 0,diff;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j]){
        //             diff = prices[j]-prices[i];
        //             if(diff>=maxprofit){
        //                maxprofit = diff;
        //             }
        //         }
        //     }
        // }
        // return maxprofit;
    }
}