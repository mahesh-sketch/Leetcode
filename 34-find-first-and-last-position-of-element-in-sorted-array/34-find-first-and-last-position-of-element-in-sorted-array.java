class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int l=0;
        // int r=nums.length;
        // int i=0;
        // while(l<r){
        //     int mid=l+(r-l)/2;
        //     if(mid==target){
        //         nums[i]= mid;
        //         i++;
        //     }
        //     else{
        //         l=mid+1;
        //         nums[i]=-1;
        //     }
        // }
        // return nums;
        
        int n=nums.length;
          int[] b = new int[]{-1,-1};
        //start
        for(int i=0;i<n;i++){
            if(nums[i]==target){
               b[0] = i;
                break; // after getting first start element;
            }
        }
        //end
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                b[1]=i;
                break; //after getting first last element;
            }
        }
        return b;
    }
}