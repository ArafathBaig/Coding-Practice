package CodeChefJulyChallenge.AdaKing;

import java.util.Arrays;
import java.util.Scanner;

class Codechef {

    private static int k = 0;
    private static int d[][] ={{1,0},{0,1},{-1,0},{0,-1},{-1,-1},{1,1},{1,-1},{-1,1}};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();

        while(t-- != 0){
            int n = scan.nextInt();
            k = n-1;
            char b [][] = new char[8][9];
            for(char r[] : b)
                Arrays.fill(r, '#');
            b[0][0] = 'O';
            boolean vis[][] = new boolean[8][8];
            dfs(b, 0, 0,vis);
            print(b);
        }
    }

    private static void dfs(char[][] b, int r, int c, boolean[][] vis){

        if(r <0 || r>= 8 || c < 0 || c>= 8 || vis[r][c])
            return;


        vis[r][c] = true;
        if(k < 0){
            b[r][c] = 'X';
            return;
        }
        k--;
        for(int i = 0;  i < d.length ;i++){
            dfs(b,r+d[i][0], c+d[i][1],vis);
        }
    }

    private static void print(char b[][]){

        for(int i = 0; i < 8 ;i++){
            for(int j =0 ; j < 8 ;j++){
                if(b[i][j] == '#'){
                    System.out.print('.');
                }else {
                    System.out.print(b[i][j]);
                }
            }
            System.out.println();
        }
    }
}
