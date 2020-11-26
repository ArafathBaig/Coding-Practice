package KJAndPJ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int n = scan.nextInt();

        int a[] = new int[n+1];

        for(int i = 0 ; i < max ;i++){
            int cur = scan.nextInt();
            int val = scan.nextInt();

            int l = cur-val<0 ? 0 : cur-val;
            int r = cur+val >=n ? n-1 : cur+val;

            a[l] += 1 ;
            a[r+1] += -1;

        }

        int m = 0, count = 0, sum = 0;
        for(int i = 0 ; i<= n ;i++){

            sum+=a[i];
            System.out.print(sum+" ");
            count = sum == 1 ? 0 : count+1;

            max = Math.max(count,max);
        }

        System.out.println();
        System.out.println(max);
    }
}
