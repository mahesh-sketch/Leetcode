class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
              return i;
            }
             if(nums[i]<target){
              count=i;
                 count++;
            }
        }
        return count;
    }
}