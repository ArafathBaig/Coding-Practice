package PerimeterOfIsland;

class Solution {

    int dir[][] = {{-1,0}, {0,-1}, {0,1},{1,0}};
    public int islandPerimeter(int[][] grid) {

        for(int i = 0 ; i < grid.length ;i++){
            for(int j = 0 ; j < grid[0].length; j++){

                if(grid[i][j] == 1)
                    return dfs(grid,i,j,grid.length, grid[0].length);
            }
        }

        return 0;
    }

    private int dfs(int g[][], int i, int j , int m, int n){


        if(i < 0 || i >= m || j < 0 || j >= n || g[i][j] == 0)
            return 1;

        if(g[i][j] == 2)
            return 0;


        int count = 0;
        g[i][j] = 2;
        for(int d[] : dir)
            count+= dfs(g,i+d[0], j+d[1], m ,n );

        return count;
    }
}