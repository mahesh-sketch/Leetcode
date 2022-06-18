class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max= nums[0];
        int sum=0;
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            if(sum>=0){
                sum=sum+nums[i];
            }
            if(sum<0){
                sum=nums[i];
           }
        if(sum>max){
     max=sum;
    }
            
        }
        return max;
      
    }
}