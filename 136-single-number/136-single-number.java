class Solution {
    public int singleNumber(int[] nums) {
        int m=nums.length;
        int c=0;
        for(int i=0;i<m;i++){
            c = c^nums[i];
        }
        return c;
    }
}