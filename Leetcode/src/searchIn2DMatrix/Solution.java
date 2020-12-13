package searchIn2DMatrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {

        if(matrix == null || matrix.length == 0)
            return false;

        int m = matrix.length , n = matrix[0].length;

        int l = 0, r = m*n - 1;

        while(l <= r){

            int mid = l + (r-l)/2;
            int row = mid/n;
            int col = mid%n;
            if(matrix[row][col] > t)
                r = mid-1;
            else if(matrix[row][col] < t)
                l = mid+1;
            else
                return true;
        }

        return false;
    }
}