class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] b = new int[m+n];
      int i= 0,j=0,k=0;
           while(i<m && j<n){
               if(nums1[i]<=nums2[j]){
                   b[k++] = nums1[i++];
               }
               else{
                   b[k++] = nums2[j++];
               }
           }
        while(i<m){
         b[k++] = nums1[i++];
        }
        while(j<n){
            b[k++] = nums2[j++];
        }
        for(int l =0;l<m+n;l++){
            nums1[l] = b[l];
        }
        
    }
}