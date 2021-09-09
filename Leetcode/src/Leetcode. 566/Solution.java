class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        
        if(m*n != r*c)
            return mat;
        
        int oned[] = new int[m*n];
        
        for(int i = 0; i < m*n ;i++){
            
            oned[i] = mat[i/n][i%n];
        }
        
        int res[][] = new int[r][c];
        
        for(int i = 0; i < r*c ; i++){
            res[i/c][i%c] = oned[i];
        }
        return res;
    }
}