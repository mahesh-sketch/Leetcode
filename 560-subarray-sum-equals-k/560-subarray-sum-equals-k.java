class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0,count=0;
        HashMap<Integer,Integer> h = new HashMap<>();
    
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==k){
                count++;
            }
            if(h.containsKey(sum-k)){
                count+=h.getOrDefault(sum-k,0);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}