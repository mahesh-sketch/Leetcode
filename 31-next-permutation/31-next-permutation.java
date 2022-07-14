class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int k= n-2;
        
        // for nothing confirmation
        if(n==0 || nums==null){
            return ;
        }
        
        // find k position ex- 3 1 4 2
        for(int i=n-1;i>0;i--){
           if(nums[i]<=nums[i-1]){
               k--;  //agar nahi mila then minus karte ja
           }
            else{
                break; // agar mil gaya then stop ho ja bhai
            }
        }
        
        //agar k= -1 ho gaya then sara ko reverse kar do ex- 4 3 2 1
        if(k == -1){
          reverse(nums,0,n-1);  
            return;
        }
        
        // k milnek bad dekho agar last element is greater than k position element then swap
        for(int i=n-1;i>0;i--){
            if(nums[k]<nums[i]){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums,k+1,n-1);
        
    }
    
    void reverse(int nums[], int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}