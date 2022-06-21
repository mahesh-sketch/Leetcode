class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int a = s.indexOf(c);
            int b = s.lastIndexOf(c);
            if(a==b){
                return a;
            }
        }
        return -1;
    }
}