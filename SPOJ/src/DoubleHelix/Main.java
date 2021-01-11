package DoubleHelix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if(n == 0)
            return;

        int a[] = new int[n];

        for(int i =0 ; i < n; i++){
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();

        if(m == 0)
            return;

        int b[]=  new int[m];
        for(int i = 0 ; i < m ; i++){
            b[i] = scan.nextInt();
        }
        int flag = 0;
        int i = 0, j = 0, sumi= 0, sumj = 0, res = 0;

        while(i < n && j < m){

            int ni = a[i];
            int nj = b[j];

            if(nj > ni){
                sumi += a[i++];
            }else if(ni > nj){
                sumj+=b[j++];
            }else{
                flag = 1;
                res += Math.max(sumi+ni, sumj+nj);
                i++;
                j++;
                sumi = 0;
                sumj = 0;
            }
        }

        while(i < n)
            sumi+=a[i++];

        while(j < m)
            sumj+=a[j++];

        if(flag == 1)
            res += Math.max(sumi, sumj);

        System.out.println(res);


    }
}
