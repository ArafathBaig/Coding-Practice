package SurroundedRegions;

class Solution {

    int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {

        if(board.length == 0 || board == null)
            return;

        int m = board.length;
        int n = board[0].length;

        int node = m*n;
        UnionFind uf = new UnionFind(board);
        for(int i = 0 ; i < m ;i++){

            if(board[i][0] == 'O')
                uf.union(i*n + 0, node);

            if(board[i][n-1] == 'O')
                uf.union(i*n + n-1, node);
        }


        for(int i = 0; i < n ;i++){

            if(board[0][i] == 'O')
                uf.union(i, node);

            if(board[m-1][i] == 'O')
                uf.union((m-1)*(n)+i, node);
        }

        for(int i = 1; i < m ;i++ ){
            for(int j = 1; j < n ;j++){

                if(board[i][j] == 'O'){

                    for(int d[] : dir){

                        if(d[0]+i >= m || d[0]+i<0 || d[1]+j >=n || d[1]+j <0)
                            continue;


                        int x = d[0]+i;
                        int y = d[1]+j;

                        if(board[x][y] == 'O')
                            uf.union(i*n + j, x*n +y);
                    }
                }
            }
        }

        for(int i = 1 ; i <m ;i++){
            for(int j = 1 ; j < n; j++){

                if(board[i][j] == 'O' && !uf.isConnected(i*n + j,node))
                    board[i][j] = 'X';
            }
        }

    }


    public class UnionFind{

        int node[] ;

        public UnionFind(char[][] board){
            int m = board.length;
            int n = board[0].length;

            this.node =  new int[m*n+1];

            for(int i = 0 ; i < m*n ;i++){
                node[i] = i;
            }
        }

        public void union(int i, int j){
            int x = find(i);
            int y = find(j);

            if( x != y){
                node[x] = y;
            }
        }

        public int find(int n){

            while(node[n] != n){
                node[n] = node[node[n]];
                n = node[n];
            }

            return n;
        }

        public boolean isConnected(int i ,int j){
            return find(i) == find(j);
        }
    }
}
