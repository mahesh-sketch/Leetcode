class Solution {
    public boolean isAnagram(String s, String t) {
        // int n =s.length();
        // int m =t.length();
        // int i=0;
        // while(n>=m){
        //     if(s.substring(i)==t.substring(i)){
        //         i++;
        //         return true; 
        //     }
        // }
        // return false;
if (s.length() != t.length()) {
return false;
} 
        else {
char[] first = s.toCharArray();
char[] second = t.toCharArray();
Arrays.sort(first);
Arrays.sort(second);
return Arrays.equals(first, second);
    }
}
}