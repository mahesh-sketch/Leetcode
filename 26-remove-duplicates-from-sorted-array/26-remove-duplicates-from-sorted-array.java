class Solution {
    public int removeDuplicates(int[] nums) {
        int m=nums.length;
        int j=0;
        for(int i=0;i<m-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[m-1];
        return j;
    }
}