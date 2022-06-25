class Solution {
    public int missingNumber(int[] nums) {
        int m=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<m;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return m;
    }
}