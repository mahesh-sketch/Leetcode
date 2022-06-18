class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> h = new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int values =0 ;
        int previousvalues = 0;
        for(int i = s.length()-1;i>=0;i--){
            int val = h.get(s.charAt(i));
            if(val<previousvalues){
                values= values-val;
            }
            else{
                values= values+val;
            }
            previousvalues = val;
        }
        return values;

    }
}