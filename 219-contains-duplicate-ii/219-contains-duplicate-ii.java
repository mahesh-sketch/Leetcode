class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0){
            return false;
        }
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){ // check value contains or not if not then add into hash
                h.put(nums[i],i);
            }
            else{
                int j=h.get(nums[i]); //if contains then return the index of that duplicate value
                if(Math.abs(i-j)<=k && nums[i]==nums[j]){ // check that abs of that is less than k if then return true
                    return true;
                }
                h.put(nums[i],i);
            }
        }
        return false;
    }
}