class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n =nums.length;
        int sum=0;
        int[] b = new int[2];
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(nums[i]+nums[j]==target){
                   return new int[] {i,j};
               }
           }
       }
       return new int[] {};
        
//            for(int i=0;i<n;i++){
//                 int numb = nums[i];
//            for(int j=i+1;j<n;j++){
//              sum=numb+nums[j];
//                if(sum==target){
//                    b[0] =i;
//                    b[1]= j;
//                }
//         }
           
// }
        // return b;
    }
}