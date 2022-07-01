/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // int s =0;
        // int b =-1;
        // while(s<=n){
        //    int mid = s+(n-1)/2;
        //     if(isBadVersion(mid)){
        //         b = mid;
        //         n=mid-1;
        //     }
        //     else{
        //     s = mid+1;
        //     }
        // }
        // return b;
        
    int l = 0;
    int r = n;
    
    while(l < r){
        int mid = l + (r - l) / 2;
        
        if(isBadVersion(mid))
            r = mid;
        else
            l = mid + 1;
    }
    return l;
    }
}