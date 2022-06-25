class Solution {
    public int[] plusOne(int[] digits) {
        int m=digits.length;
        // int sum=0;
        // for(int i=0;i<m;i++){
        //     if((m-1)==i){
        //      sum=digits[i]+1;
        //     digits[i] =sum;
        //     }
        // }
        // return digits;
        for(int i=m-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
              digits[i] =0;
            }
        }
        if(digits[0]==0){
            int[] r = new int[m+1];
            r[0] = 1;
            return r;
        }
        return digits;
    }
}