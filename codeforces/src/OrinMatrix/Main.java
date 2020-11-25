package OrinMatrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int a[][] = new int[m][n];
        int temp[][] = new int[m][n];

        for(int i = 0 ;i < m;i++){
            for(int j =0 ; j < n ;j++){
                a[i][j] = scan.nextInt();
            }
        }

        for(int i = 0 ; i < m ;i++){
            for(int j = 0 ; j < n;j++){

                if(a[i][j] == 0)
                    continue;

                int left = 0 , right = 0;

                for(int k = 0 ;  k < n ;k++){
                    left+= a[i][k];
                }

                for(int k = 0; k < m;k++){
                    right += a[k][j];
                }

                if((left != 0 && right != 0 ) && (left != n && right != m)){
                    System.out.println("NO");
                    return;
                }

                if(left == n && right == m)
                    temp[i][j] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.println("YES");
        for(int i = 0 ; i< m ;i++){
            for(int j =0 ; j<n;j++){
                sb.append(temp[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }


}
