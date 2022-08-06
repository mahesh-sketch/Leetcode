class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int lc=0,rc=n-1; // lc denotes leftcoloumn and rc denotes right coloumn
        int tr=0,br=m-1; // tr denotes top row and br denotes bottom row
        
        int d=0;
        
        while(lc<=rc && tr<=br){
         
            if(d==0) //left to right direction
            {
                for(int i=lc;i<=rc;++i){
                    a.add(matrix[tr][i]);
                }
                d =1;
                tr++;
            }
            else if(d==1) //top to bottom direction
            {
                for(int i=tr;i<=br;++i){
                    a.add(matrix[i][rc]);
                }
                d =2;
                rc--;
            }
             else if(d==2) //right to left direction
            {
                for(int i=rc;i>=lc;i--){
                    a.add(matrix[br][i]);
                }
                d =3;
                 br--;
            }
             else if(d==3) //bottom to top direction
            {
                for(int i=br;i>=tr;i--){
                    a.add(matrix[i][lc]);
                }
                d =0;
                 lc++;
            }
            
        }
        return a;
    }
}