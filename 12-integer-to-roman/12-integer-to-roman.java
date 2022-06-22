class Solution {
    public String intToRoman(int num) {
//         HashMap<Character,Integer> h = new HashMap<>();
//         h.put('I',1);
//         h.put('V',5);
//         h.put('X',10);
//         h.put('L',50);
//         h.put('C',100);
//         h.put('D',500);
//         h.put('M',1000);
//       StringBuilder roman = new StringBuilder();  
//         for(int i=0;i<h.size();i++){
//           while(num>=h.get(i)){
//             num = num - h.get(i);  
// roman.append(h.add(i));
//           }
//         }
//        return roman.toString();
        int[] nums= {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] s ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
         StringBuilder roman = new StringBuilder();  
        for(int i=0;i<nums.length;i++){
            while(num>=nums[i]){

                num = num-nums[i];
                roman.append(s[i]);
            }
        }
            return roman.toString();
        
    }
}