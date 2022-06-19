class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;
        if((r * c) != (m * n)) {
            return mat;
        }
        
        int[] elements = new int[m * n];
        int k = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                elements[k++] = mat[i][j];
            }
        }
        
        k = 0;
        int[][] res = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                res[i][j] = elements[k++];
            }
        }
        
        return res;
    }
}