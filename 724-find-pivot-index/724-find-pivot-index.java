class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0,left=0;
        for(int i=0;i<n;i++){
            total = total+nums[i];
        }
        for(int i=0;i<n;i++){
            if(left==(total-left-nums[i])){
                return i;
            }
            else{
                left =left+nums[i];
            }
        }
        return -1;
    }
}