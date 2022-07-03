class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int n=numbers.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //   if(numbers[i]+numbers[j]==target){
        //         return new int[]{i+1,j+1};
        //     }
        //     }
        // }
        // return new int[]{};
        
        int l = 0, h=numbers.length-1;
        while(l<=h){
            int val=numbers[l] + numbers[h];
            if(val==target){
            return new int[]{l+1,h+1};
            }
            else if(val<target){
                l++;
            }
            else{
          h--;
            }
        }
        return new int[]{};
    }
}