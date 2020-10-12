package WordSearch;
class Solution {
    int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    public boolean exist(char[][] board, String word) {

        int m = board.length, n = board[0].length;
        boolean vis[][] = new boolean[m][n];


        for(int i = 0; i < m ;i++ ){
            for(int j = 0 ;j < n; j++){


                if(board[i][j] == word.charAt(0) && dfs(word,board,vis,i,j,0))
                    return true;
            }
        }

        return false;

    }

    private boolean dfs(String word, char[][] b, boolean vis[][], int i , int j, int index){

        if(index >= word.length())
            return true;


        if(i>= b.length || i < 0 || j >= b[0].length || j < 0 || vis[i][j] || word.charAt(index) != b[i][j])
            return false;

        vis[i][j] = true;

        for(int d[] : dir){

            if(dfs(word,b,vis,i+d[0], j+d[1],index+1))
                return true;

        }

        vis[i][j] = false;

        return false;
    }
}