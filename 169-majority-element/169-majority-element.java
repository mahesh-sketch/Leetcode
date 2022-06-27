class Solution {
    public int majorityElement(int[] nums) {
//         int n=nums.length;
//         int count=1;
//         int a=0;
//         Arrays.sort(nums);
//         if(n==1){
//             return nums[0];
//         }
//         for(int i=0;i<n-1;i++){
//             if(nums[i]==nums[i+1]){
//            count++;
//                 if(count>n/2){
//                     a=nums[i];
//                 }
//             }
//             else{
//                 count=1;
//             }
            
//         }
//         return a;
        int n=nums.length;
         int a=0;
        for(int i=0;i<n;i++){
        int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/2){
                a = nums[i];
            }
        }
        return a;
    }
}