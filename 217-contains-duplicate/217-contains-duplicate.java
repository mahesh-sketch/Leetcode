class Solution {
    public boolean containsDuplicate(int[] nums) {
         int n = nums.length;
        // for(int i =0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //        while(nums[i]==nums[j]){
        //            return true;
        //        }
        //     }
        // }
        // return false;
        
        HashSet<Integer> h = new HashSet<>();
        for(int i =0; i<n; i++){
            if(h.contains(nums[i])){
                return true;
            }
            h.add(nums[i]);
        }
        return false;
        
    }
}