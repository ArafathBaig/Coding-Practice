class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                if(i == j){
                    continue;
                }
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        
        int j = matrix.length - 1;
        for(int i = 0 ; i < matrix.length ; i++){
            
                for(int k = 0 ; k < matrix.length && j>i ; k++){
                    
                    int temp = matrix[k][i];
                    matrix[k][i] = matrix[k][j];
                    matrix[k][j] = temp;
                
                }
                j--;
            }
            
    }
}