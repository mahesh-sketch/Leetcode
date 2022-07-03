class Solution {
    public int maxProfit(int[] prices) {
       int[] t = new int[prices.length];
        for(int i=1;i<prices.length;i++){ // store all add values into array
            t[i-1] = prices[i] - prices[i-1];
        }
        int max=0;
        // check from t array which is greater than 0 then add to max
        for(int i=0;i<t.length;i++){
            if(t[i]>=0)
            max= max+t[i];
        }
        return max;
    }
}