class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int i=1;i<=n;i++){
       int count = 0;
            for(int j=0;j<n;j++){
                if(nums[j] >= i ){
                count++;
            }
        }
            if(count==i){
                return count;
            }
         }
        return -1;
    }
}