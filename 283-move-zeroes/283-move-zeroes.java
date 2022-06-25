class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
         if(nums[i]!=0){
             nums[k++] = nums[i];
         }
        }
        int t = n-k;
            for(int i=0;i<t;i++){
                nums[k++]=0;
            }
    }
}