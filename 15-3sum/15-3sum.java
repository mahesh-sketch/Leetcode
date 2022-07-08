class Solution {
    List<List<Integer>> res = new ArrayList<>(); // global declartion
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i-1]!=nums[i]){
             TwoSum(i+1,nums.length-1,nums,0-nums[i]);   
            }
        }
    return res;
    }
         void TwoSum(int i,int j,int[] nums,int target){
            int a = nums[i-1];
            while(i<j){
              if(nums[i]+nums[j]>target){
                  j--;
              }
                else if(nums[i]+nums[j]<target){
                    i++;
                }
                else{
                  List<Integer> h = new ArrayList<>();
                  h.add(a);  h.add(nums[i]); h.add(nums[j]);
                 res.add(h);
                    // for b duplicate
                    while(i<j && nums[i]==nums[i+1])i++;
                    //for c duplicate
                       while(i<j && nums[j]==nums[j-1])j--;
                    i++;
                    j--;
                }
            }
        }
}